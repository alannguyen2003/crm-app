/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alannguyen.repository;

import com.alannguyen.entity.JobEntity;
import com.alannguyen.util.DBUtil;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author acer
 */
public class JobRepository {
    public ArrayList<JobEntity> getAllJobs() throws Exception {
        ArrayList<JobEntity> list = new ArrayList<>();
        Connection cn = DBUtil.makeConnection();
        PreparedStatement pst;
        ResultSet rs = null;
        if (cn != null) {
            String query = "select * from jobs";
            pst = cn.prepareStatement(query);
            rs = pst.executeQuery();
        }
        if (rs != null) {
            while (rs.next()) {
                JobEntity entity = new JobEntity();
                entity.setId(rs.getInt(1));
                entity.setName(rs.getNString(2));
                entity.setStartDate(rs.getDate(3));
                entity.setEndDate(rs.getDate(4));
                list.add(entity);
            }
        }
        return list;
    }
    
    public static void main(String[] args) throws Exception {
        JobRepository jobRepository = new JobRepository();
        for (JobEntity entity : jobRepository.getAllJobs()) {
            System.out.println(entity);
        }
    }
}
