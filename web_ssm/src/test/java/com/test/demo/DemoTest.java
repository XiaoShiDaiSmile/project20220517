package com.test.demo;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.test.dao.UserDao;
import com.test.domain.User;
import com.test.mapper.UserMapper;
import com.test.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

/**
 * @author 李俊彬
 * @package com.test.demo
 * @date 2022/5/17 20:51
 * @week 星期二
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class DemoTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserMapper userMapper;
    @Test
    public void Test4(){
        List<User> allList = userMapper.findAllList();
        System.out.println(allList);
    }
    @Test
    public void Test3() throws SQLException {
        ResourceBundle bundle = ResourceBundle.getBundle("orm/jdbc");
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(bundle.getString("jdbc.driver"));
        dataSource.setUrl(bundle.getString("jdbc.url"));
        dataSource.setUsername(bundle.getString("jdbc.user"));
        dataSource.setPassword(bundle.getString("jdbc.password"));
        DruidPooledConnection conn = dataSource.getConnection();
        System.out.println(conn);
    }
    @Test
    public void Test2() throws PropertyVetoException, SQLException {
        ResourceBundle bundle = ResourceBundle.getBundle("orm/jdbc");
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(bundle.getString("jdbc.driver"));
        dataSource.setJdbcUrl(bundle.getString("jdbc.url"));
        dataSource.setUser(bundle.getString("jdbc.user"));
        dataSource.setPassword(bundle.getString("jdbc.password"));
        Connection conn = dataSource.getConnection();
        System.out.println(conn);
    }
    @Test
    public void Test1(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        UserService userDao = (UserService) app.getBean("userService");
        userDao.findAllList();
        app.close();
    }
}
