package com.vin.back.application.dto;

public class HashtagDTO {
    private Long id;

    private String name;

    public HashtagDTO() {
    }

    public HashtagDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HashtagDTO [id=" + id + ", name=" + name + "]";
    }

}
