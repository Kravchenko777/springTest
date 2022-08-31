package com.xammax.utils;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.xammax.entity.UserEntity;
import com.xammax.local.UserLocal;
import com.xammax.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserQuery implements GraphQLQueryResolver {

    @Autowired
    private UserRepository userRepository;

    public Integer userscount(){
        return 100;
    }

    public UserEntity userbyid(Long value){
        return userRepository.findById(value).get();
    }

    public UserLocal userFirst(){
        return new UserLocal(userRepository.findById(1L).get());
    }

}
