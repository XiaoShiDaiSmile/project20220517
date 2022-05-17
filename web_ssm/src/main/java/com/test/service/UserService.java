package com.test.service;

import com.test.domain.User;

import java.util.List;

/**
 * @author 李俊彬
 * @package com.test.service
 * @date 2022/5/17 20:57
 * @week 星期二
 */
public interface UserService {
    public List<User> findAllList();
    public User findByUsername(String username);
    public void insertUser(User user);
}
