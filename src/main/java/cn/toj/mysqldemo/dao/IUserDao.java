package cn.toj.mysqldemo.dao;

import cn.toj.mysqldemo.domain.User;

import java.util.List;

public interface IUserDao {

    List<User> findAll();

}
