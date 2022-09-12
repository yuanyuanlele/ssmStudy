package com.le.mybatis.mapper;

import com.le.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * 添加用户信息
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     * @return
     */
    int updateUser();

    /**
     * 删除用户信息
     * @return
     */
    int deleteUser();

    /**
     * 通过id查找用户
     * @return
     */
    User getUserbyId();

    /**
     * 查询所有
     * @return
     */
    List<User> getAllUser();
}
