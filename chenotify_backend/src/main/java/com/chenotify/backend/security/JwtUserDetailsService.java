package com.chenotify.backend.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Replace this with DB-backed user lookup
        if ("user".equals(username)) {
            return User.builder()
                    .username("user")
                    .password("{noop}password") // no encoding for testing
                    .roles("USER")
                    .build();
        }
        throw new UsernameNotFoundException("User not found: " + username);
    }
}
