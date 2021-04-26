package com.todolist.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@Controller
public class MyController {
    @GetMapping
    @RequestMapping(path = "/Firstproject")
    public String Todo(){
        return "this is my first todo";
    }

    @GetMapping
    @RequestMapping(path = "/Secondpath")
    public String DoTo(){
        return "this is my second todo";
    }

    @GetMapping
    @RequestMapping(path = "/ThirdPath")
    public List Imp(){
        ArrayList MyList;
        ArrayList<Integer> Mylist = new ArrayList<Integer>();
        Mylist.add(2);
        return Mylist;
    }

    @GetMapping
    @RequestMapping(path = "/temporarypath")
    public String Temp(){
        return "This is temp function";
    }

    @PostMapping
    @RequestMapping(path = "/post1")
    @ResponseBody
    public int add(@RequestParam("x") int x,@RequestParam("y") int y){
        return x+y;
    }
    @GetMapping
    @RequestMapping(path = "/home")
    public String newRequest(){
        return "home";
    }
    @GetMapping
    @RequestMapping(path = "/newhome")
    public String myRequest() {
        return "newhome";
    }
}
