/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ministryRegistration.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author mushabe
 */
@Entity (name="Teacher")
public class Teacher implements Serializable {
    @Id
    private String FileNo;
    
    private String firstName,lastName,username,password,monthBirth,yearBirth,gender,location,telNo,email;

    public String getFileNo() {
        return FileNo;
    }

    public void setFileNo(String FileNo) {
        this.FileNo = FileNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMonthBirth() {
        return monthBirth;
    }

    public void setMonthBirth(String monthBirth) {
        this.monthBirth = monthBirth;
    }

    public String getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(String yearBirth) {
        this.yearBirth = yearBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
