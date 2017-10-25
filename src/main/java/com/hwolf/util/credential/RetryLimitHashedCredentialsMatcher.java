package com.hwolf.util.credential;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 缓存每个user 重新登录的次数
 * @author HWOLF
 * @version create in：17-10-24 下午3:03
 * @descrption
 */
public class RetryLimitHashedCredentialsMatcher extends HashedCredentialsMatcher{
    private Cache<String,AtomicInteger> passwordRetryCache;

    public RetryLimitHashedCredentialsMatcher(CacheManager cacheManager) {
        this.passwordRetryCache = cacheManager.getCache("passwordRetryCache");
    }

    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        String username = (String) token.getPrincipal();
        //retry count+1
        AtomicInteger retryCount = passwordRetryCache.get(username);
        if (retryCount==null){
//            新建计数
            retryCount = new AtomicInteger(0);
            passwordRetryCache.put(username,retryCount);
        }
        if (retryCount.incrementAndGet() > 5){
            //超过五次，禁止尝试了
            throw new ExcessiveAttemptsException("over 5 times");
        }
        //判断用户身份
        boolean matches = super.doCredentialsMatch(token,info);

        if (matches){
            passwordRetryCache.remove(username);
        }
        return matches;
    }
}
