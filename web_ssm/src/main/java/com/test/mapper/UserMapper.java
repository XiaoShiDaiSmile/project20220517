package com.test.mapper;

import com.test.domain.User;

import java.util.List;

/**
 * @author 李俊彬
 * @package com.test.mapper
 * @date 2022/5/17 21:34
 * @week 星期二
 */
public interface UserMapper {
    List<User> findAllList();
    User findByUsername(String username);
    void insertUser(User user);
}
