package com.hyuk.server.controller;


import com.hyuk.server.controller.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/server")
public class ServerApiController {

    @GetMapping("/hello")
    public String hello() {
        User user = new User();
        user.setName("steve");
        user.setAge(10);
        return user.toString();
    }
}
