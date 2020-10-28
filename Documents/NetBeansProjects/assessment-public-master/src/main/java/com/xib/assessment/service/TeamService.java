/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xib.assessment.service;

import com.xib.assessment.Agent;
import com.xib.assessment.AgentRepository;
import com.xib.assessment.Team;
import com.xib.assessment.TeamRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Muzamiru.Mbaziira
 */
@Service
public class TeamService {
     @Autowired
    TeamRepository team_reposotory;

    public TeamService(TeamRepository team_reposotory) {
        this.team_reposotory = team_reposotory;
    }
    
        //getting all individual record by using the method findaAll() of CrudRepository
    public List<Team> getAllTeam() 
    {
    List<Team> team = new ArrayList<Team>();


    team_reposotory.findAll().forEach(team1 -> team.add(team1));
    return team;
    }
    

    //getting a specific record by using the method findById() of CrudRepository
public Team getTeamsById(Long id) 
{
return team_reposotory.findById(id).get();
}
//saving a specific record by using the method save() of CrudRepository
public void saveOrUpdate(Team team) 
{
team_reposotory.save(team);
}
//deleting a specific record by using the method deleteById() of CrudRepository
public void delete(Long id) 
{
team_reposotory.deleteById(id);
}
//updating a record
public void update(Team team, Long id) 
{
team_reposotory.save(team);
}

    
}
