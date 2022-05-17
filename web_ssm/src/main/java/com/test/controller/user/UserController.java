package com.test.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 李俊彬
 * @package com.test.controller.user
 * @date 2022/5/17 21:50
 * @week 星期二
 */
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("/login")
    public String login(){
        return "user/login";
    }
}
