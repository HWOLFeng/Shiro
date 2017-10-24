package com.hwolf.dao;

import com.hwolf.entity.Role;

/**
 * @author HWOLF
 * @version create in：17-10-24 下午3:34
 * @descrption
 */
public interface RoleDao {
    Role createRole(Role role);
    void deleteRole(Long roleId);

    void correlationPermissions(Long roleId, Long... permissionIds);
    void uncorrelationPermissions(Long roleId, Long... permissionIds);
}
