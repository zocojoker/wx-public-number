package com.zc.wx.service.impl;

import com.zc.wx.dao.IUserDao;
import com.zc.wx.entity.UserEntity;
import com.zc.wx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务处理
 *
 * @author zoco
 * @creat 2018-04-20-13:00
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao dao;
    @Override
    public List<UserEntity> getAllUser() {
        return dao.getAllUser();
    }
}
