package com.vin.back.application.dto;

import com.vin.back.domain.model.userEntity;

public class ShortUserDTO {
    private Long id;
    private String username;
    private String fullname;
    private String profilephotouri;

    public ShortUserDTO(userEntity userEntity) {
        this.id = userEntity.getId();
        this.username = userEntity.getUsername();
        this.fullname = userEntity.getFullname();
        this.profilephotouri = userEntity.getProfilephotouri();
    }

}
