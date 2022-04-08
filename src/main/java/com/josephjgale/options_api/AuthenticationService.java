package com.josephjgale.options_api;

public class AuthenticationService {
    private UserRepository userRepository;

    public boolean authenticate(String username, String password){
        User user = userRepository.findByUsername(username);
        return "welcome123".equals(password);
    }
}
