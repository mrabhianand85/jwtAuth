package com.jwt.jwtExample.Controller;

import com.jwt.jwtExample.Model.User;
import com.jwt.jwtExample.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    public UserService userService;

    @GetMapping("/users")
    public List<User> getUser(){
        System.out.println("Getting Users");
        return this.userService.getUser();
    }

    @GetMapping("/current-users")
    public String currentUser(Principal principal){
        return principal.getName();
    }
}
