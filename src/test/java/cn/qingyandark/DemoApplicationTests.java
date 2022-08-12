package cn.qingyandark;

import cn.qingyandark.domain.User;
import cn.qingyandark.mapper.UserMapper;
import cn.qingyandark.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        userService.save();
        User byId = userMapper.getById(1);
        System.out.println(byId);
    }
}
