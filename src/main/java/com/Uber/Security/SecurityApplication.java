package com.Uber.Security;

import com.Uber.Security.Auth.AuthenticationService;
import com.Uber.Security.Auth.RegisterRequest;
import com.Uber.Security.User.Role;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AuthenticationService service) {
        return args -> {

            var admin = RegisterRequest.builder()
                    .firstname("Admin")
                    .lastname("Admin")
                    .email("admin@gmail.com")
                    .password("password")
                    .role(Role.ADMIN)
                    .build();

            System.out.println("Admin token: " + service.register(admin).getAccessToken());

            var manager = RegisterRequest.builder()
                    .firstname("Manager")
                    .lastname("Manager")
                    .email("manager@gmail.com")
                    .password("password")
                    .role(Role.MANAGER)
                    .build();

            System.out.println("Manager token: "
                    + service.register(manager).getAccessToken());

            var driver = RegisterRequest.builder()
                    .firstname("Driver")
                    .lastname("Driver")
                    .email("driver@gmail.com")
                    .password("password")
                    .role(Role.DRIVER)
                    .build();

            System.out.println("Driver token: "
                    + service.register(driver).getAccessToken());

            var user = RegisterRequest.builder()
                    .firstname("User")
                    .lastname("User")
                    .email("user@gmail.com")
                    .password("password")
                    .role(Role.USER)
                    .build();

            System.out.println("User token: "
                    + service.register(user).getAccessToken());

        };
    }
}