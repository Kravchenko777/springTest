package com.xammax.controllers;

import com.xammax.local.TestAOP;
import com.xammax.local.UserLocal;
import com.xammax.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/user")
public class UserController {


    Logger logger = LoggerFactory.getLogger(UserController.class);

    private UserRepository userRepository;

    UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/list")
    @TestAOP
    public List<UserLocal> getUsersList(){
        logger.error("Ошибка");
        logger.debug("Дебаг");
        return userRepository.findAllBy().stream().map(UserLocal::new).collect(Collectors.toList());

    }

    @GetMapping("/getuser")
    public UserLocal getUserById(@RequestParam Long id){

        return new UserLocal();
    }

}
