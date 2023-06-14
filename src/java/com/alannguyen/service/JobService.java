/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alannguyen.service;

import com.alannguyen.entity.JobEntity;
import com.alannguyen.repository.JobRepository;
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class JobService {
    
    private JobRepository jobRepository = new JobRepository();
    
    public ArrayList<JobEntity> getAllJobs() throws Exception {
        return jobRepository.getAllJobs();
    }
}
