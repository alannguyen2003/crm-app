/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alannguyen.payload.request;

import java.util.Date;

/**
 *
 * @author acer
 */
public class TaskRequest {
    private int id;
    private String name;
    private Date startDate;
    private Date endDate;
    private String userName;
    private String jobName;
    private String statusName;

    public TaskRequest() {
    }

    public TaskRequest(int id, String name, Date startDate, Date endDate, String userName, String jobName, String statusName) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.userName = userName;
        this.jobName = jobName;
        this.statusName = statusName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    @Override
    public String toString() {
        return "TaskRequest{" + "id=" + id + ", name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", userName=" + userName + ", jobName=" + jobName + ", statusName=" + statusName + '}';
    }
    
    
}
