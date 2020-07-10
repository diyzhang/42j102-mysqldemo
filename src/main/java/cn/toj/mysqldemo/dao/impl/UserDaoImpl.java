package cn.toj.mysqldemo.dao.impl;

import cn.toj.mysqldemo.dao.IUserDao;
import cn.toj.mysqldemo.domain.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Carlos
 * @description
 * @Date 2020/7/10
 */

public class UserDaoImpl implements IUserDao {

    public List<User> findAll() {

        List<User> users = new LinkedList<User>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功");

            String url = "jdbc:mysql://localhost:3306/user?characterEncoding=utf-8&useSSL=false&serverTimezone=UTC";
            String user = "root";
            String password = "root";
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("数据库连结成功");

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM user";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                User userResult = new User();
                userResult.setId(rs.getInt("id"));
                userResult.setSex(rs.getString("sex"));
                userResult.setAddress(rs.getString("address"));
                userResult.setUsername(rs.getString("username"));
                users.add(userResult);
            }
            rs.close();
            stmt.close();
            conn.close();


        }catch (Exception e) {
            e.printStackTrace();
        }
        return users;

    }
}
