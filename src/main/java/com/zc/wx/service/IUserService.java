package com.zc.wx.service;

import com.zc.wx.entity.UserEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * author foresee
 * creat time 2018/4/20
 */
public interface IUserService {
    List<UserEntity> getAllUser();
}
