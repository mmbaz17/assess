/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xib.assessment.service;

import com.xib.assessment.Agent;
import com.xib.assessment.AgentRepository;
import com.xib.assessment.Manager;
import com.xib.assessment.ManagerRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Muzamiru.Mbaziira
 */
@Service
public class ManagerService {
    @Autowired
    ManagerRepository manager_reposotory;

                    public ManagerService(ManagerRepository manager_reposotory) {
                        this.manager_reposotory = manager_reposotory;
                    }

                        //getting all individual record by using the method findaAll() of CrudRepository
                    public List<Manager> getAllManager() 
                    {
                    List<Manager> manager = new ArrayList<Manager>();


                    manager_reposotory.findAll().forEach(manager1 -> manager.add(manager1));
                    return manager;
                    }


                    //getting a specific record by using the method findById() of CrudRepository
                public Manager getManagersById(Long id) 
                {
                return manager_reposotory.findById(id).get();
                }
                
         public Manager findAgent(Long id) {
                 return manager_reposotory.findById(id).get();
            }
         
                //saving a specific record by using the method save() of CrudRepository
                public void saveOrUpdate(Manager manager) 
                {
                manager_reposotory.save(manager);
                }
                //deleting a specific record by using the method deleteById() of CrudRepository
                public void delete(Long id) 
                {
                manager_reposotory.deleteById(id);
                }
                //updating a record
                public void update(Manager manager, Long id) 
                {
                manager_reposotory.save(manager);
                }





}
