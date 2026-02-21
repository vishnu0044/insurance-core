package com.insurancecore.core.service;

import com.insurancecore.core.entity.Role;
import com.insurancecore.core.repository.RoleRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    @Transactional
    public Role createRole(String name) {

        if (roleRepository.existsByName(name)) {
            throw new RuntimeException("Role already exists");
        }

        Role role = Role.builder()
                .name(name)
                .build();

        return roleRepository.save(role);
    }
}
