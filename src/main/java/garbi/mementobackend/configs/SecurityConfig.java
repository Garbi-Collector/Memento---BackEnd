package garbi.mementobackend.configs;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth. requestMatchers("/", "/auth/google").permitAll()
                        .anyRequest().authenticated()
                )
                .oauth2Login(oauth -> oauth.loginPage("/auth/google")
                );
        return http.build();
    }


}
