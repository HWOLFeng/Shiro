package com.hwolf.dao.impl;

import com.hwolf.dao.RoleDao;
import com.hwolf.entity.Role;

/**
 * @author HWOLF
 * @version create in：17-10-24 下午3:34
 * @descrption
 */
public class RoleDaoImpl implements RoleDao {
    @Override
    public Role createRole(Role role) {
        return null;
    }

    @Override
    public void deleteRole(Long roleId) {

    }

    @Override
    public void correlationPermissions(Long roleId, Long... permissionIds) {

    }

    @Override
    public void uncorrelationPermissions(Long roleId, Long... permissionIds) {

    }
}
