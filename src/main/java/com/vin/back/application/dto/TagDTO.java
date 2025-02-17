package com.vin.back.application.dto;

public class TagDTO {
    private Long id;
    private ShortUserDTO userTagged;

    public TagDTO(Long id, ShortUserDTO userTagged) {
        this.id = id;
        this.userTagged = userTagged;
    }

}
