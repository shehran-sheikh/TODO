package com.todolist.todolist.entity;


import javax.persistence.*;

@Entity
@Table(name="newuser")
public class NewUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "p_name")
    private String userName;

    @Column(name = "password")
    private String password;
    @Column(name = "email_id")
    private String emailId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail_id() {
        return emailId;
    }

    public void setEmail_id(String email_id) {
        this.emailId = emailId;
    }
}
