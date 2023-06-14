/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alannguyen.payload.request;

/**
 *
 * @author acer
 */
public class UserRequest {
    private int id;
    private String email;
    private String fullname;
    private String phone;
    private String roleName;

    public UserRequest() {
    }

    public UserRequest(int id, String email, String fullname, String phone, String roleName) {
        this.id = id;
        this.email = email;
        this.fullname = fullname;
        this.phone = phone;
        this.roleName = roleName;
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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "UserRequest{" + "id=" + id + ", email=" + email + ", fullname=" + fullname + ", phone=" + phone + ", roleName=" + roleName + '}';
    }
    
    
}
