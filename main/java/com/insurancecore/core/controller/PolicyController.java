package com.insurancecore.core.controller;

import com.insurancecore.core.dto.PolicyCreateRequest;
import com.insurancecore.core.entity.Policy;
import com.insurancecore.core.service.PolicyService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policy")
public class PolicyController {

    private PolicyService policyService;

    @PostMapping
    public Policy createPolicy(@RequestBody PolicyCreateRequest request) {
        return policyService.createPolicy(request);
    }
}
