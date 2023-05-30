package org.platform2.poc.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("org.platform2.poc.repository")
@EntityScan("org.platform2.poc.repository.entity")
@ComponentScan("org.platform2")
public class Platform2PocApplication {
    public static void main(String[] args) {
        SpringApplication.run(Platform2PocApplication.class, args);
    }
}
