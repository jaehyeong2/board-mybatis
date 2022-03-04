package jjfactory.mybatis.controller;

import jjfactory.mybatis.model.User;
import jjfactory.mybatis.model.enums.Role;
import jjfactory.mybatis.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class UserController {
    private final UserService userService;

    @PostMapping("/join")
    public ResponseEntity<?> join(User user){
        user.setRole("USER");
        userService.signUp(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
