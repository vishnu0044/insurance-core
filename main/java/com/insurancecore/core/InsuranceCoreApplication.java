package com.insurancecore.core;

import com.insurancecore.core.entity.Agent;
import com.insurancecore.core.repository.AgentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class InsuranceCoreApplication {

    public static void main(String[] args) {

        SpringApplication.run(InsuranceCoreApplication.class, args);
    }
}