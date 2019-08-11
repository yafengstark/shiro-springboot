package com.zns.shiro;

import com.zns.shiro.domain.User;
import com.zns.shiro.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootShiroApplicationTests {

    @Autowired
    private UserService userService;
    @Test
    public void contextLoads() {
        User user = userService.findByName("demo");
        System.out.println(user);
    }

}
