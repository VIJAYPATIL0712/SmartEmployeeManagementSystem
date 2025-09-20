package com.project.smartEMS.service;

import com.project.smartEMS.entity.User;
import com.project.smartEMS.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public void register(User user) {
        userRepository.save(user);
    }

    public boolean login(User user) {
        // Find user by username
        User existingUser = userRepository.findByUsername(user.getUsername())
                .orElse(null);

        if (existingUser == null) {
            return false; // user not found
        }

        return existingUser.getPassword().equals(user.getPassword());
    }

}
