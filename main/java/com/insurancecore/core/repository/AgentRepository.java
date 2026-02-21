package com.insurancecore.core.repository;

import com.insurancecore.core.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agent, Integer> {
    boolean existsByAgentCode(String agentCode);
}
