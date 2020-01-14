package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @author: ZPX
 * @createDate: 2020/1/14 21:46
 * @version: 1.0
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String gotoLogin() {
        return "login";
    }
}




