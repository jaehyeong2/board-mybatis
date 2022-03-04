package jjfactory.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/join")
    public String joinForm(){
        return "joinForm";
    }

    @GetMapping("login")
    public String loginForm(){
        return "loginForm";
    }
}
