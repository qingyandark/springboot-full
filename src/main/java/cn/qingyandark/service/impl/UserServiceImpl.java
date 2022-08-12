package cn.qingyandark.service.impl;

import cn.qingyandark.domain.User;
import cn.qingyandark.mapper.UserMapper;
import cn.qingyandark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public boolean save(User user) {
        return userMapper.save(user) > 0;
    }

    public boolean update(User user) {
        return userMapper.update(user) > 0;
    }

    public boolean delete(Integer id) {
        return userMapper.delete(id) > 0;
    }

    public User getById(Integer id) {
        return userMapper.getById(id);
    }

    public List<User> selectALL() {
        return userMapper.selectALL();
    }
}