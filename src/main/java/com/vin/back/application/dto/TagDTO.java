package com.vin.back.application.dto;

public class TagDTO {
    private Long id;
    private ShortUserDTO userTagged;

    public TagDTO() {
    }

    public TagDTO(Long id, ShortUserDTO userTagged) {
        this.id = id;
        this.userTagged = userTagged;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShortUserDTO getUserTagged() {
        return userTagged;
    }

    public void setUserTagged(ShortUserDTO userTagged) {
        this.userTagged = userTagged;
    }

    @Override
    public String toString() {
        return "TagDTO [id=" + id + ", userTagged=" + userTagged + "]";
    }

}
