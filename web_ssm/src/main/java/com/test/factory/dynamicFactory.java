package com.test.factory;

import com.test.dao.UserDao;
import com.test.dao.impl.UserDaoImpl;

/**
 * @author 李俊彬
 * @package com.test.factory
 * @date 2022/5/17 20:55
 * @week 星期二
 */
public class dynamicFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
