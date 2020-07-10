package cn.toj.mysqldemo;

import cn.toj.mysqldemo.dao.IUserDao;
import cn.toj.mysqldemo.dao.impl.UserDaoImpl;
import cn.toj.mysqldemo.domain.User;

import java.util.List;

/**
 * @author Carlos
 * @description 测试类
 * @Date 2020/7/10
 */

public class MyqlTest {

    public static void main(String[] args) {

        IUserDao test = new UserDaoImpl();
        List<User> users = test.findAll();

        for (User user : users) {
            System.out.println(user);
        }

    }

}
