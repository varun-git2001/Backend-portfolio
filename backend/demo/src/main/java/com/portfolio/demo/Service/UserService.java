package com.portfolio.demo.Service;

import com.portfolio.demo.Table.User;
import com.portfolio.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findUserById(Long userId) {
        return userRepository.findById(userId);
    }

}
