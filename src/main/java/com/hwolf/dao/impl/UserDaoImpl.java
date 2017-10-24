package com.hwolf.dao.impl;

import com.hwolf.dao.UserDao;
import com.hwolf.entity.User;

import java.util.Set;

/**
 * @author HWOLF
 * @version create in：17-10-24 下午3:35
 * @descrption
 */
public class UserDaoImpl implements UserDao {
    @Override
    public User add(User user) {
        return null;
    }

    @Override
    public void deleteByPrimeId(Long userId) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public User findByPrimeId(Long userId) {
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public void correlationRoles(Long userId, Long... roleIds) {

    }

    @Override
    public void uncorrelationRoles(Long userId, Long... roleIds) {

    }

    @Override
    public Set<String> findRoles(String username) {
        return null;
    }

    @Override
    public Set<String> findPermissions(String username) {
        return null;
    }
}
