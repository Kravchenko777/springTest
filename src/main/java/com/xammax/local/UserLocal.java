package com.xammax.local;

import com.xammax.entity.UserEntity;
import lombok.Data;

@Data
public class UserLocal {
    private long id;
    private String name;

    public UserLocal(){}

    public UserLocal(UserEntity u){
        this.id = u.getUniqueId();
        this.name = u.getName();

    }


}
