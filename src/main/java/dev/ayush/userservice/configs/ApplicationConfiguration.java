package dev.ayush.userservice.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public BCryptPasswordEncoder createBCryptPasswordEncoder() {
        //just added a comment for git here
        return new BCryptPasswordEncoder();
    }
}
