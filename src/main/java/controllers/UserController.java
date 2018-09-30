package controllers;


import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import repo.UserRepository;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    public List<User> retrieveAllStudents() {
        return (List<User>) userRepository.findAll();
    }
}
