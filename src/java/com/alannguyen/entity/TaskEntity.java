/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alannguyen.entity;

import java.util.Date;

/**
 *
 * @author acer
 */
public class TaskEntity {
    private int id;
    private String name;
    private Date startDate;
    private Date endDate;
    private int userId;
    private int jobId;
    private int statusId;

    public TaskEntity() {
    }

    public TaskEntity(int id, String name, Date startDate, Date endDate, int userId, int jobId, int statusId) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.userId = userId;
        this.jobId = jobId;
        this.statusId = statusId;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    @Override
    public String toString() {
        return "TaskEntity{" + "id=" + id + ", name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", userId=" + userId + ", jobId=" + jobId + ", statusId=" + statusId + '}';
    }
    
    
}
