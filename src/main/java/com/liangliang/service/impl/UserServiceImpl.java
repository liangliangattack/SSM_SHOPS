package com.liangliang.service.impl;

import com.liangliang.dao.IUserDao;
import com.liangliang.model.User;
import com.liangliang.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}