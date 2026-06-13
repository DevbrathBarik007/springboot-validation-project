package com.springboot.validation.Entity;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class loginForm {
    @NotBlank(message = "User Name can not empty")
    @Size(min =3 ,max=25,message = "User name must be between 3-25 character..")
    public String userName;
    @Email(message = "Invalid email")
    @NotBlank(message = "Email is required")
    public String email;
    @AssertTrue(message = "Must Agreed Terms & Condition *")
    public boolean checked;

    public loginForm() {
    }

    public loginForm(String userName, boolean checked, String email) {
        this.userName = userName;
        this.checked = checked;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public String toString() {
        return "loginForm{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", checked=" + checked +
                '}';
    }
}

