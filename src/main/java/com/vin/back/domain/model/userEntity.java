package com.vin.back.domain.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class userEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String fullName;
    private String eMail;
    private LocalDate birth;
    private Long phone;
    private String password;
    public userEntity() {
    }

    public userEntity(LocalDate birth, String eMail, String fullName, Long id, String password, Long phone, String userName) {
        this.birth = birth;
        this.eMail = eMail;
        this.fullName = fullName;
        this.id = id;
        this.password = password;
        this.phone = phone;
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("userEntity{");
        sb.append("id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", fullName=").append(fullName);
        sb.append(", eMail=").append(eMail);
        sb.append(", birth=").append(birth);
        sb.append(", phone=").append(phone);
        sb.append(", password=").append(password);
        sb.append('}');
        return sb.toString();
    }

}
