package cn.qingyandark.service;

import cn.qingyandark.domain.User;

import java.util.List;

public interface UserService {
    public boolean save(User user);

    public boolean update(User user);

    public boolean delete(Integer id);

    public User getById(Integer id);

    List<User> selectALL();
}
