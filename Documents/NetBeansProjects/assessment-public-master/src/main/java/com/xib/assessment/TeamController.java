package com.xib.assessment;

import com.xib.assessment.service.AgentService;
import com.xib.assessment.service.TeamService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
    @Autowired
    TeamService team_service;

   
  //creating a get mapping that retrieves all the individual detail from the database 
@GetMapping("/team")
private List<Team> getAllTeam() 
{
return team_service.getAllTeam();
}
//creating a get mapping that retrieves the detail of a specific person
@GetMapping("/team/{id}")
private Team getTeams(@PathVariable("id") Long id) 
{
return team_service.getTeamsById(id);
}
//creating a delete mapping that deletes a specified person
@DeleteMapping("/team/{id}")
private void deleteTeam(@PathVariable("id") Long id) 
{
team_service.delete(id);
}
//creating post mapping that post the person detail in the database
@PostMapping("/teams")
private Long saveTeam(@RequestBody Team team) 
{
team_service.saveOrUpdate(team);
return team.getId();
}
//creating put mapping that updates the person detail 
@PutMapping("/teams")
private Team update(@RequestBody Team team) 
{
team_service.saveOrUpdate(team);
return team;
}

}
