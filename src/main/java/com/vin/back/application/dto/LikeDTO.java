package com.vin.back.application.dto;

public class LikeDTO {
    private Long id;
    private ShortUserDTO user;

    public LikeDTO(Long id, ShortUserDTO user) {
        this.id = id;
        this.user = user;
    }
}
