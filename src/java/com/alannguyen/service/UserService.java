/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alannguyen.service;

import com.alannguyen.repository.UserRepository;

/**
 *
 * @author acer
 */
public class UserService {
    
    private UserRepository userRepository = new UserRepository();
    public boolean checkLogin(String email, String password) throws Exception {
        return userRepository.getAccount(email, password) == null? false : true;
    }
}
