package cn.qingyandark.service.impl;

import cn.qingyandark.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        System.out.println("user save ......");
    }
}