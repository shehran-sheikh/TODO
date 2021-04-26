package com.todolist.todolist.Dao;

import com.todolist.todolist.entity.NewUser;
import com.todolist.todolist.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewDao {
    @Autowired
    public SessionFactory dboperation;

    public void savelatestuser(String name, String password,String email_id) {
        NewUser u = new NewUser();
        u.setUserName(name);
        u.setPassword(password);
        u.setEmail_id(email_id);

        Session s = dboperation.openSession();
        s.beginTransaction();
        s.save(u);
        s.getTransaction().commit();
    }
}
