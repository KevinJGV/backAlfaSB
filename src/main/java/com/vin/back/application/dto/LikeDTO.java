package com.vin.back.application.dto;

public class LikeDTO {
    private Long id;
    private Long rawPostId;
    private Long rawUserId;
    private ShortUserDTO user;

    public LikeDTO() {
    }

    public LikeDTO(Long id, ShortUserDTO user) {
        this.id = id;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRawPostId() {
        return rawPostId;
    }

    public void setRawPostId(Long rawPostId) {
        this.rawPostId = rawPostId;
    }

    public Long getRawUserId() {
        return rawUserId;
    }

    public void setRawUserId(Long rawUserId) {
        this.rawUserId = rawUserId;
    }

    public ShortUserDTO getUser() {
        return user;
    }

    public void setUser(ShortUserDTO user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "LikeDTO [id=" + id + ", rawPostId=" + rawPostId + ", rawUserId=" + rawUserId + ", user=" + user + "]";
    }

}
