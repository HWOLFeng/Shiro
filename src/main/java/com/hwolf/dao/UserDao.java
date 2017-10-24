package com.hwolf.dao;

import com.hwolf.entity.User;

import java.util.Set;

/**
 * @author HWOLF
 * @version create in：17-10-24 下午3:30
 * @descrption
 */
public interface UserDao {
    User add(User user);

    void deleteByPrimeId(Long userId);

    void update(User user);

    User findByPrimeId(Long userId);

    User findByUsername(String username);

    void correlationRoles(Long userId, Long... roleIds);

    void uncorrelationRoles(Long userId, Long... roleIds);

    Set<String> findRoles(String username);

    Set<String> findPermissions(String username);

}
