/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alannguyen.repository;

import com.alannguyen.entity.TaskEntity;
import com.alannguyen.payload.request.TaskRequest;
import com.alannguyen.util.DBUtil;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author acer
 */
public class TaskRepository {

    public ArrayList<TaskRequest> getAllTasks() throws Exception {
        ArrayList<TaskRequest> list = new ArrayList<>();
        Connection cn = DBUtil.makeConnection();
        PreparedStatement pst;
        ResultSet rs = null;
        if (cn != null) {
            String query = "select t.id, t.name, t.start_date, t.end_date, u.fullname, j.name, s.name from tasks t\n"
                    + "join jobs j \n"
                    + "on j.id = t.job_id\n"
                    + "join users u\n"
                    + "on t.user_id = u.id\n"
                    + "join status s \n"
                    + "on s.id = t.status_id";
            pst = cn.prepareStatement(query);
            rs = pst.executeQuery();
        }
        if (rs != null) {
            while (rs.next()) {
                TaskRequest request = new TaskRequest();
                request.setId(rs.getInt(1));
                request.setName(rs.getNString(2));
                request.setStartDate(rs.getDate(3));
                request.setEndDate(rs.getDate(4));
                request.setUserName(rs.getNString(5));
                request.setJobName(rs.getNString(6));
                request.setStatusName(rs.getNString(7));
                list.add(request);
            }
        }
        return list;
    }
    
    public static void main(String[] args) throws Exception {
        TaskRepository repository = new TaskRepository();
        for (TaskRequest request : repository.getAllTasks()) {
            System.out.println(request);
        }
    }
}
