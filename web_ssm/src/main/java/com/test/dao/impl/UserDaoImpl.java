package com.test.dao.impl;

import com.test.dao.UserDao;
import com.test.domain.User;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author 李俊彬
 * @package com.test.dao.impl
 * @date 2022/5/17 20:49
 * @week 星期二
 */
@Component("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public List<User> findAllList() {
        System.out.println("nihao.....");
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public void insertUser(User user) {

    }

    @PostConstruct
    public void init(){
        System.out.println("init......");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy....");
    }
}
