package com.vin.back.application.dto;

import java.time.LocalDate;
import java.util.List;

import com.vin.back.domain.model.userEntity;
public class UserDTO {
    private Long id;
    private String username;
    private String email;
    private String fullname;
    private LocalDate birthdate;
    private Long phone;
    private String profilephotouri;
    private String biography;
    private List<ShortUserDTO> followers;
    private List<ShortUserDTO> followed;

    public UserDTO(userEntity user, List<ShortUserDTO> followers, List<ShortUserDTO> followed) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.fullname = user.getFullname();
        this.profilephotouri = user.getProfilephotouri();
        this.biography = user.getBiography();
        this.followers = followers;
        this.followed = followed;
    }
}
