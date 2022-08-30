package com.xammax.controllers;

import com.xammax.local.UserLocal;
import com.xammax.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class UserController {

    private UserRepository userRepository;

    UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/list")
    public List<UserLocal> getUsersList(){
        return userRepository.findAllBy().stream().map(UserLocal::new).collect(Collectors.toList());

    }

    @GetMapping("/user")
    public UserLocal getUserById(@RequestParam Long id){

        return new UserLocal();
    }

}
