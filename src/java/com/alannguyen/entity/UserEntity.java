/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alannguyen.entity;

/**
 *
 * @author acer
 */
public class UserEntity {
    private int id;
    private String email;
    private String password;
    private String fullname;
    private String avatar;
    private int roleId;
    private String phone;

    public UserEntity() {
    }

    public UserEntity(int id, String email, String password, String fullname, String avatar, int roleId, String phone) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.fullname = fullname;
        this.avatar = avatar;
        this.roleId = roleId;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserEntity{" + "id=" + id + ", email=" + email + ", password=" + password + ", fullname=" + fullname + ", avatar=" + avatar + ", roleId=" + roleId + ", phone=" + phone + '}';
    }
    
    
}
