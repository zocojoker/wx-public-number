package com.zc.wx.dao;

import com.zc.wx.entity.UserEntity;

import java.util.List;

/**
 * author foresee
 * creat time 2018/4/20
 */
public interface IUserDao {
    public List<UserEntity> getAllUser();
}
