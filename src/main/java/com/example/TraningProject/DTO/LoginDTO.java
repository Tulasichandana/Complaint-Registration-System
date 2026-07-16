package com.example.TraningProject.DTO;

public class LoginDTO {

    private String email;
    private String password;

    // Default Constructor
    public LoginDTO() {
    }

    // Parameterized Constructor
    public LoginDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getter and Setter for Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for Password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}