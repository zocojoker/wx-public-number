package com.zc.wx.controller;

import com.zc.wx.entity.UserEntity;
import com.zc.wx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 用户控制类
 *
 * @author zoco
 * @creat 2018-04-20-13:04
 */
@Controller
public class UserController {
    @Autowired
    private IUserService service;

    @RequestMapping(value = "/users.do")
    @ResponseBody
    public List<UserEntity> getAlluser(HttpServletRequest request, HttpServletResponse response) {
        List<UserEntity> users = service.getAllUser();
        return users;
    }
}
