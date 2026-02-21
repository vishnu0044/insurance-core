package com.insurancecore.core.service;

import com.insurancecore.core.dto.PolicyCreateRequest;
import com.insurancecore.core.entity.Agent;
import com.insurancecore.core.entity.Policy;
import com.insurancecore.core.repository.AgentRepository;
import com.insurancecore.core.repository.PolicyRepository;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PolicyService {
    private final PolicyRepository policyRepository;
    private final AgentRepository agentRepository;

    @Transactional
    public Policy createPolicy(PolicyCreateRequest request) {

        Agent agent = agentRepository.findById(Math.toIntExact(request.getAgentId()))
                .orElseThrow(() -> new RuntimeException("Agent not found"));

        Policy policy = Policy.builder()
                .policyId(request.getPolicyId())
                .policyType(request.getPolicyType())
                .premiumAmount(request.getPremiumAmount())
                .startDate(request.getStartDate())
                .endDate(request.getEndDate())
                .status(request.getStatus())
                .agent(agent)
                .build();

        return policyRepository.save(policy);
    }
}
