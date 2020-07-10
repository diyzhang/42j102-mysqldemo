package cn.toj.mysqldemo.domain;

/**
 * @author Carlos
 * @description 用户实体类
 * @Date 2020/7/10
 */

public class User {

    private Integer id;
    private String username;
    private String sex;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adderess) {
        this.address = adderess;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", adderess='" + address + '\'' +
                '}';
    }
}
