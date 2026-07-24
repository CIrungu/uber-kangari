package com.Uber.Security.Config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import static com.Uber.Security.User.Permission.*;
import static com.Uber.Security.User.Role.*;
import org.springframework.http.HttpMethod;
import static org.springframework.security.authorization.AuthorityReactiveAuthorizationManager.hasAnyRole;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfiguration {


    private final JwtAuthentication jwtAuthentication;

    private final AuthenticationProvider authenticationProvider;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .csrf(AbstractHttpConfigurer::disable)
                .cors(AbstractHttpConfigurer::disable)

                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/v1/auth/**")
                        .permitAll()


                        .requestMatchers("/api/v1/manager/**")
                        .hasAnyRole(ADMIN.name(), MANAGER.name())

                        .requestMatchers(HttpMethod.GET, "/api/v1/manager/**")
                        .hasAnyAuthority(
                                ADMIN_READ.getPermission(),
                                MANAGER_READ.getPermission()
                        )

                        .requestMatchers(HttpMethod.POST, "/api/v1/manager/**")
                        .hasAnyAuthority(
                                ADMIN_CREATE.getPermission(),
                                MANAGER_CREATE.getPermission()
                        )

                        .requestMatchers(HttpMethod.PUT, "/api/v1/manager/**")
                        .hasAnyAuthority(
                                ADMIN_UPDATE.getPermission(),
                                MANAGER_UPDATE.getPermission()
                        )

                        .requestMatchers(HttpMethod.DELETE, "/api/v1/manager/**")
                        .hasAnyAuthority(
                                ADMIN_DELETE.getPermission(),
                                MANAGER_DELETE.getPermission())


                        .requestMatchers("/api/v1/admin/**")
                        .hasRole(ADMIN.name())

                        .requestMatchers(HttpMethod.GET, "/api/v1/admin/**")
                        .hasAuthority(ADMIN_READ.getPermission())
                        .requestMatchers(HttpMethod.POST, "/api/v1/admin/**")
                        .hasAuthority(ADMIN_CREATE.getPermission())
                        .requestMatchers(HttpMethod.PUT, "/api/v1/admin/**")
                        .hasAuthority(ADMIN_UPDATE.getPermission())
                        .requestMatchers(HttpMethod.DELETE, "/api/v1/admin/**")
                        .hasAuthority(ADMIN_DELETE.getPermission())


                        .requestMatchers("/api/v1/driver/**")
                        .hasAnyRole(ADMIN.name(), MANAGER.name(), DRIVER.name())


                        .requestMatchers(HttpMethod.GET, "/api/v1/driver/**")
                        .hasAnyAuthority(
                                ADMIN_READ.getPermission(),
                                MANAGER_READ.getPermission(),
                                DRIVER_READ.getPermission()
                        )



                        .requestMatchers(HttpMethod.PUT, "/api/v1/driver/**")
                        .hasAnyAuthority(
                                ADMIN_UPDATE.getPermission(),
                                MANAGER_UPDATE.getPermission(),
                                DRIVER_UPDATE.getPermission())



                        .requestMatchers("/api/v1/user/**")
                        .hasAnyRole(ADMIN.name(), MANAGER.name(), USER.name())

                        .requestMatchers(HttpMethod.GET, "/api/v1/user/**")
                        .hasAnyAuthority(
                                ADMIN_READ.getPermission(),
                                MANAGER_READ.getPermission(),
                                USER_READ.getPermission()
                        )



                        .requestMatchers(HttpMethod.PUT, "/api/v1/user/**")
                        .hasAnyAuthority(
                                ADMIN_UPDATE.getPermission(),
                                MANAGER_UPDATE.getPermission(),
                                USER_UPDATE.getPermission()
                        )




                        .anyRequest()
                        .authenticated()
                )

                .sessionManagement(session -> session
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )

                .authenticationProvider(authenticationProvider)

                .addFilterBefore(
                        jwtAuthentication,
                        UsernamePasswordAuthenticationFilter.class
                );

        return http.build();
    }
}

