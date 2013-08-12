package com.sample.bean.user;

/**
 * Created with IntelliJ IDEA.
 * User: MEISEI
 * Date: 13-8-9
 * Time: 下午5:36
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private int id;
    private String userName;
    private String password;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
