package com.hwolf.dao;

import com.hwolf.entity.Permissions;

/**
 * @author HWOLF
 * @version create in：17-10-24 下午3:34
 * @descrption
 */
public interface PermissionDao {
    Permissions createPermission(Permissions permission);

    public void deletePermission(Long permissionId);
}
