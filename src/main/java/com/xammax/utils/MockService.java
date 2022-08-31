package com.xammax.utils;

import lombok.Data;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Data
public class MockService {

    private String str;
    private Integer in;
    private Boolean bool;

    @PostConstruct
    public void init(){
        str="123";
        in = 123;
        bool = true;
    }

    public String doWork(){

        return str;
    }

    public String doWork(String f){

        return f;
    }

    public String doWork(String f, String g){

        return f+g;
    }

    public Boolean isWork(){

        return bool;
    }

    public void getInt(){

    }
}
