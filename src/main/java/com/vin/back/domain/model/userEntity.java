package com.vin.back.domain.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="costumers")
public class userEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;
    private String fullname;
    
    @Column(unique = true)
    private String email;
    private LocalDate birth;
    private Long phone;
    private String password;
    public userEntity() {
    }

    public userEntity(LocalDate birth, String eMail, String fullName, Long id, String password, Long phone, String userName) {
        this.birth = birth;
        this.email = eMail;
        this.fullname = fullName;
        this.id = id;
        this.password = password;
        this.phone = phone;
        this.username = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullName) {
        this.fullname = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String eMail) {
        this.email = eMail;
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
        sb.append(", userName=").append(username);
        sb.append(", fullName=").append(fullname);
        sb.append(", eMail=").append(email);
        sb.append(", birth=").append(birth);
        sb.append(", phone=").append(phone);
        sb.append(", password=").append(password);
        sb.append('}');
        return sb.toString();
    }

}
