/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alannguyen.repository;

import java.sql.*;
import com.alannguyen.entity.UserEntity;
import com.alannguyen.util.DBUtil;
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class UserRepository {

    public ArrayList<UserEntity> getAllUser() throws Exception {
        ArrayList<UserEntity> list = new ArrayList<>();
        Connection cn = DBUtil.makeConnection();
        PreparedStatement pst;
        ResultSet rs = null;
        if (cn != null) {
            String query = "select * from users";
            pst = cn.prepareStatement(query);
            rs = pst.executeQuery();
        }
        if (rs != null) {
            while (rs.next()) {
                UserEntity entity = new UserEntity();
                entity.setId(rs.getInt(1));
                entity.setEmail(rs.getNString(2));
                entity.setPassword(rs.getNString(3));
                entity.setFullname(rs.getNString(4));
                entity.setAvatar(rs.getNString(5));
                entity.setRoleId(rs.getInt(6));
                entity.setPhone(rs.getString(7));
                list.add(entity);
            }
        }
        return list;
    }

    public UserEntity getAccount(String email, String password) throws Exception {
        UserEntity entity = null;
        Connection cn = DBUtil.makeConnection();
        PreparedStatement pst;
        ResultSet rs = null;
        if (cn != null) {
            String query = "select * from users\n"
                    + "where email = ? and password = ?";
            pst = cn.prepareStatement(query);
            pst.setString(1, email);
            pst.setString(2, password);
            rs = pst.executeQuery();
        }
        if (rs.next()) {
            entity = new UserEntity();
            entity.setId(rs.getInt(1));
            entity.setEmail(rs.getNString(2));
            entity.setPassword(rs.getNString(3));
            entity.setFullname(rs.getNString(4));
            entity.setAvatar(rs.getNString(5));
            entity.setRoleId(rs.getInt(6));
            entity.setPhone(rs.getString(7));
        }
        return entity;
    }

    public static void main(String[] args) throws Exception {
        UserRepository repository = new UserRepository();
//        for (UserEntity entity : repository.getAllUser()) {
//            System.out.println(entity);
//        }
        System.out.println(repository.getAccount("nguyenho30112003@gmail.com", "123456"));
    }
}
