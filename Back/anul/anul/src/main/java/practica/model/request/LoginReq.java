package com.example.springjwt.model.request;


public class LoginReq {
    private String email;
    private String password;
    private String phonenumber;

    public LoginReq(String email, String password, phonenumber) {
        this.email = email;
        this.password = password;
        this.phonenumber = phonenumber;
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

    public String getPhonenumber() {
        return phonenumber
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}