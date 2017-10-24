package com.hwolf.dao;

import com.hwolf.entity.Permission;
import com.hwolf.entity.Role;

/**
 * @author HWOLF
 * @version create in：17-10-24 下午3:34
 * @descrption
 */
public interface PermissionDao {
    Permission createPermission(Permission permission);

    public void deletePermission(Long permissionId);
}
