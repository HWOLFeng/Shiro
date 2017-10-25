package com.hwolf.mapper;

import com.hwolf.entity.Role;

/**
 * @author HWOLF
 * @version create in：17-10-25 下午7:21
 * @descrption
 */


public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}
