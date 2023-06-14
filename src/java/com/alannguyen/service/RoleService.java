/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alannguyen.service;

import com.alannguyen.entity.RoleEntity;
import com.alannguyen.repository.RoleRepository;
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class RoleService {
    private RoleRepository roleRepository = new RoleRepository();
    
    public ArrayList<RoleEntity> getAllRoles() throws Exception {
        return roleRepository.getAllRoles();
    }
}
