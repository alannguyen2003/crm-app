/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alannguyen.repository;

import com.alannguyen.entity.RoleEntity;
import com.alannguyen.util.DBUtil;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author acer
 */
public class RoleRepository {

    public ArrayList<RoleEntity> getAllRoles() throws Exception {
        Connection cn = DBUtil.makeConnection();
        ArrayList<RoleEntity> list = new ArrayList<>();
        PreparedStatement pst;
        ResultSet rs = null;
        if (cn != null) {
            String query = "select * from roles";
            pst = cn.prepareStatement(query);
            rs = pst.executeQuery();
        }
        if (rs != null) {
            while (rs.next()) {
                RoleEntity entity = new RoleEntity();
                entity.setId(rs.getInt(1));
                entity.setName(rs.getNString(2));
                entity.setDescription(rs.getString(3));
                list.add(entity);
            }
        }
        return list;
    }

    public static void main(String[] args) throws Exception {
        RoleRepository repository = new RoleRepository();
        for (RoleEntity entity : repository.getAllRoles()) {
            System.out.println(entity);
        }
    }
}
