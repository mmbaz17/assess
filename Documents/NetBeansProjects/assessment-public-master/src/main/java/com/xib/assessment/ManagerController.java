package com.xib.assessment;

import com.xib.assessment.service.AgentService;
import com.xib.assessment.service.ManagerService;
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
public class ManagerController {
    @Autowired
    ManagerService manager_service;

   
  //creating a get mapping that retrieves all the individual detail from the database 
@GetMapping("/manager")
private List<Manager> getAllManager() 
{
return manager_service.getAllManager();
}
//creating a get mapping that retrieves the detail of a specific person
@GetMapping("/manager/{id}")
private Manager getManagers(@PathVariable("id") Long id) 
{
return manager_service.getManagersById(id);
}
//creating a delete mapping that deletes a specified person
@DeleteMapping("/manager/{id}")
private void deleteManager(@PathVariable("id") Long id) 
{
manager_service.delete(id);
}
//creating post mapping that post the person detail in the database
@PostMapping("/managers")
private Long saveManager(@RequestBody Manager manager) 
{
manager_service.saveOrUpdate(manager);
return manager.getId();
}
//creating put mapping that updates the person detail 
@PutMapping("/managers")
private Manager update(@RequestBody Manager manager) 
{
manager_service.saveOrUpdate(manager);
return manager;
}

}
