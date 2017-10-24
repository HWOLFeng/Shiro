package com.hwolf.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * @author HWOLF
 * @version create in：17-10-22 下午9:03
 * @descrption
 */
public class MyRealm implements Realm{
    public static final String NAME = "hwf";
    public static final String PASS = "hwf123";
    @Override
    public String getName() {
        return "myRealm1";
    }

    @Override
    public boolean supports(AuthenticationToken authenticationToken) {
        return authenticationToken instanceof UsernamePasswordToken;
    }

    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String) authenticationToken.getPrincipal();
        String password = new String((char[])authenticationToken.getCredentials());
        String testPassword = (String) authenticationToken.getCredentials();
        if (!NAME.equals(username)){
            throw new UnknownAccountException();
        }
        if (!PASS.equals(password)){
            throw new IncorrectCredentialsException();
        }
        System.out.println(password);
        System.out.println(testPassword);
        return new SimpleAuthenticationInfo(username,password,getName());
    }
}
