package com.insurancecore.core.controller;

import com.insurancecore.core.entity.Agent;
import com.insurancecore.core.service.AgentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agents")
@RequiredArgsConstructor
public class AgentController {

    private final AgentService agentService;

    @PostMapping
    public Agent createAgent(@RequestBody Agent agent) {

        return agentService.createAgent(agent);
    }
}
