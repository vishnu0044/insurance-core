CREATE TABLE policy (
                        id BIGINT PRIMARY KEY AUTO_INCREMENT,
                        policy_id VARCHAR(30) NOT NULL UNIQUE,
                        policy_type VARCHAR(50) NOT NULL,
                        premium_amount DECIMAL(12,2) NOT NULL,
                        start_date DATE NOT NULL,
                        end_date DATE NOT NULL,
                        status VARCHAR(20) NOT NULL,
                        agent_id BIGINT NOT NULL,
                        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        CONSTRAINT fk_policy_agent
                            FOREIGN KEY (agent_id)
                                REFERENCES agent(id)
);