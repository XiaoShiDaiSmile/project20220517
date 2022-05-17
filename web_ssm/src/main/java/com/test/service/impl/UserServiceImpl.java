package com.test.service.impl;

import com.test.dao.UserDao;
import com.test.domain.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李俊彬
 * @package com.test.service.impl
 * @date 2022/5/17 20:58
 * @week 星期二
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name="userDao")
    private UserDao userDao;

    @Override
    public List<User> findAllList() {
       userDao.findAllList();
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public void insertUser(User user) {

    }
}
