package com.liangliang.dao;

import com.liangliang.model.User;

public interface IUserDao {

    User selectUser(long id);

}