package com.example.springjwt.model.request;


public class LoginReq {
    private String email;
    private String password;
    private String number;

    public LoginReq(String email, String password) {
        this.email = email;
        this.password = password;
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNumber(String number){
        this.number = number
    }
}