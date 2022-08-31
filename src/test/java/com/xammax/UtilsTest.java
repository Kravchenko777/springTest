package com.xammax;

import com.xammax.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UtilsTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void test(){
        System.out.println(userRepository.getFirstValueTest(1L).getName());
    }
}
