package com.example.dslist.dto;

import com.example.dslist.entities.Game;
import com.example.dslist.projections.GameMinProjection;

public class GameMinDTO {
    private Long id;
    private String gameTitle;
    private Integer publicationYear;
    private String coverImgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.gameTitle = entity.getGameTitle();
        this.publicationYear = entity.getPublicationYear();
        this.coverImgUrl = entity.getCoverImgUrl();
        this.shortDescription = entity.getShortDescription();
    }

    public GameMinDTO(GameMinProjection entity) {
        this.id = entity.getId();
        this.gameTitle = entity.getGameTitle();
        this.publicationYear = entity.getPublicationYear();
        this.coverImgUrl = entity.getCoverImgUrl();
        this.shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public String getCoverImgUrl() {
        return coverImgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
