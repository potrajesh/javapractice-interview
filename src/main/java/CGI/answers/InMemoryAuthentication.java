/*
Explanation of URL Restrictions
Role-Based URL Restrictions:
        /admin*/
/**: Restricted to users with the ADMIN role using .hasRole("ADMIN").
 Completely Deny Access:

 /restricted/**: Deny access to everyone using .denyAll().
 Other Restrictions:

 /user/**: Accessible to users with USER or ADMIN roles using .hasAnyRole("USER", "ADMIN").
 Default Restriction:

 Any other URL will require authentication with .anyRequest().authenticated().


@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        // Restrict specific URL patterns
                        .requestMatchers("/admin/**").hasRole("ADMIN")  // Only ADMIN can access /admin/**
                        .requestMatchers("/restricted/**").denyAll()   // Deny access to /restricted/**
                        .requestMatchers("/user/**").hasAnyRole("USER", "ADMIN") // USER or ADMIN can access /user/**
                        .anyRequest().authenticated() // All other requests need authentication
                )
                .formLogin(form -> form
                        .loginPage("/login")
                        .permitAll() // Allow access to the login page
                )
                .logout(logout -> logout.permitAll()); // Allow logout for all users

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        return new InMemoryUserDetailsManager(
                User.withUsername("user")
                        .password(passwordEncoder().encode("password"))
                        .roles("USER")
                        .build(),
                User.withUsername("admin")
                        .password(passwordEncoder().encode("admin"))
                        .roles("ADMIN")
                        .build()
        );
    }
}
*/
