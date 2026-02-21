package com.insurancecore.core.repository;

import com.insurancecore.core.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.Set;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
    Set<Role> findAllByName(String name);
    boolean existsByName(String name);
}
