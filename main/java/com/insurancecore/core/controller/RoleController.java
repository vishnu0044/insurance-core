package com.insurancecore.core.controller;

import com.insurancecore.core.entity.Role;
import com.insurancecore.core.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
public class RoleController {
    private final RoleService roleService;

    @PostMapping
    public ResponseEntity<Role> createRole(@RequestBody Map<String, String > requestRole) {
        Role role = roleService.createRole(requestRole.get("name"));
        return ResponseEntity.ok().body(role);
    }
}
