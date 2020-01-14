package com.example.demo.Pojo;

import java.io.Serializable;

/**
 * @Description: 用户实体类
 * @author: ZPX
 * @createDate: 2020/1/14 20:08
 * @version: 1.0
 */
public class User implements Serializable {
    private Integer id;
    private String password;
    private String name;

    private String sex;

    private String address;

    private String phone;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public User() {
    }

    public User(Integer id, String password, String name, String sex, String address, String phone) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
    }
}