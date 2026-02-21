package com.insurancecore.core.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString
public class UserRequestDTO {
    private String username;
    private String password;
    Set<String> roles;
}
