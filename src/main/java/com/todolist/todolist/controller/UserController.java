package com.todolist.todolist.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping
    @RequestMapping(path = "/Users")
    public String Todo(){
        return "Test !";
    }
}
