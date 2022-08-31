package com.xammax.utils;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.xammax.entity.UserEntity;
import com.xammax.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMutation implements GraphQLMutationResolver {

    @Autowired
    private UserRepository userRepository;


    public UserEntity createVehicle(String name){
       UserEntity userEntity = new UserEntity();
       userEntity.setName(name);
       userEntity =  userRepository.save(userEntity);
       return userEntity;

   }
}
