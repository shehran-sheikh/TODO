package com.todolist.todolist.Dao;

import com.todolist.todolist.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainDao {
    @Autowired
    public SessionFactory dboperation;

    public void saveUser(){
        User u = new User();
        u.setUserName("Sherry");
        u.setPassword("abc@123");
        Session s = dboperation.openSession();
        s.beginTransaction();
        s.save(u);
        s.getTransaction().commit();
    }

    public void saveNewuser(String clientName,String password){
        User u1 = new User();
        u1.setUserName(clientName);
        u1.setPassword(password);
//        u1.setUserId(11);
        Session s1 = dboperation.openSession();
        s1.beginTransaction();
        s1.save(u1);
        s1.getTransaction().commit();
    }
}
