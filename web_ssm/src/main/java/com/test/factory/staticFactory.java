package com.test.factory;

import com.test.dao.UserDao;
import com.test.dao.impl.UserDaoImpl;

/**
 * @author 李俊彬
 * @package com.test.factory
 * @date 2022/5/17 20:54
 * @week 星期二
 */
public class staticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
