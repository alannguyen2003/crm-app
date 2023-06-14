/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alannguyen.service;

import com.alannguyen.payload.request.TaskRequest;
import com.alannguyen.repository.TaskRepository;
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class TaskService {
    private TaskRepository taskRepository = new TaskRepository();
    
    public ArrayList<TaskRequest> getAllTasks() throws Exception {
        return taskRepository.getAllTasks();
    }
}
