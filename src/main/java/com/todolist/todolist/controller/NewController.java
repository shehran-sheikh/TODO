package com.todolist.todolist.controller;

import com.todolist.todolist.Dao.MainDao;
import com.todolist.todolist.Dao.NewDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class NewController {
    @Autowired
    MainDao m;

    @GetMapping
    @RequestMapping(path = "/newcontrolget")
    public String hello() {
        m.saveUser();
        return "hello user";
    }

    @PostMapping
    @RequestMapping(path = "/newcontrolpost")
    @ResponseBody
    public String data(@RequestParam("name") String name, @RequestParam("age") int age) {
        return "Hello " + name + " you are " + age + " years old";
    }

    @PostMapping
    @RequestMapping(path = "/dboperationpost")
    @ResponseBody
    public String userData(@RequestParam("username") String clientName, @RequestParam("password") String password) {
        m.saveNewuser(clientName, password);
        return "username is: " + clientName + " password is: " + password;

    }

    @Autowired
    NewDao n;

    @PostMapping
    @RequestMapping(path = "/testapp")
    @ResponseBody
    public String userData(@RequestParam("username") String name, @RequestParam("password") String password, @RequestParam("email_id") String email_id) {
        n.savelatestuser(name, password, email_id);
        return "username is: " + name + " password is: " + password + "email_id is: " + email_id;
    }

}
