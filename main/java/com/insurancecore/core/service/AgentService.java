package com.insurancecore.core.service;

import com.insurancecore.core.entity.Agent;
import com.insurancecore.core.repository.AgentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class AgentService {

    private final AgentRepository repository;
    public AgentService(AgentRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Agent createAgent(Agent agent) {
        return repository.save(agent);
    }

}