package com.xib.assessment;

import com.xib.assessment.service.AgentService;
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
public class AgentController {

    @Autowired
    AgentService agent_service;

    @GetMapping("agent/{id}")
    public Agent findAgent(@PathVariable("id") Long id) {
        return agent_service.findAgent(id);
    }

    @GetMapping("/agent")
    private List<Agent> getAllAgent() {
        return agent_service.getAllAgent();
    }

    @DeleteMapping("/agent/{id}")
    private void deleteAgent(@PathVariable("id") Long id) {
        agent_service.delete(id);
    }

    @PostMapping("/agents")
    private Long saveAgent(@RequestBody Agent agent) {
        agent_service.saveOrUpdate(agent);
        return agent.getId();
    }

    @PutMapping("/agents")
    private Agent update(@RequestBody Agent agent) {
        agent_service.saveOrUpdate(agent);
        return agent;
    }

}
