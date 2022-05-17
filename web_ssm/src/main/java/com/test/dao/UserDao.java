package com.test.dao;

import com.test.domain.User;

import java.util.List;

/**
 * @author 李俊彬
 * @package com.test.dao
 * @date 2022/5/17 20:47
 * @week 星期二
 */
public interface UserDao {
    public List<User> findAllList();
    public User findByUsername(String username);
    public void insertUser(User user);
}
