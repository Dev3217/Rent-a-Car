package com.project.services;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.project.repositories.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
	@Autowired
    private final UserRepository userRepository;
	

    public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}


	public UserDetailsService userDetailsService() {
        return new UserDetailsService() {

            public UserDetails loadUserByUsername(String username) {
                return userRepository.findFirstByEmail(username)
                        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
            }
        };
    }

}
