/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xib.assessment.service;

import com.xib.assessment.Agent;
import com.xib.assessment.AgentRepository;
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
public class AgentService {
    @Autowired
    AgentRepository agent_reposotory;

                    public AgentService(AgentRepository agent_reposotory) {
                        this.agent_reposotory = agent_reposotory;
                    }

                        //getting all individual record by using the method findaAll() of CrudRepository
                    public List<Agent> getAllAgent() 
                    {
                    List<Agent> agent = new ArrayList<Agent>();


                    agent_reposotory.findAll().forEach(agent1 -> agent.add(agent1));
                    return agent;
                    }


                    //getting a specific record by using the method findById() of CrudRepository
//                public Agent getAgentsById(Long id) 
//                {
//                return agent_reposotory.findById(id).get();
//                }
                
         public Agent findAgent(Long id) {
                 return agent_reposotory.findById(id).get();
            }
         
                //saving a specific record by using the method save() of CrudRepository
                public void saveOrUpdate(Agent agent) 
                {
                agent_reposotory.save(agent);
                }
                //deleting a specific record by using the method deleteById() of CrudRepository
                public void delete(Long id) 
                {
                agent_reposotory.deleteById(id);
                }
                //updating a record
                public void update(Agent agent, Long id) 
                {
                agent_reposotory.save(agent);
                }





}
