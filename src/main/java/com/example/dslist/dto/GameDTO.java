package com.example.dslist.dto;

import com.example.dslist.entities.Game;

public class GameDTO {
    private Long id;
    private String gameTitle;
    private Integer publicationYear;
    private String gameGenre;
    private String platforms;
    private Double gameScore;
    private String coverImgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO() {
    }

    public GameDTO(Game game) {
        this.id = game.getId();
        this.gameTitle = game.getGameTitle();
        this.publicationYear = game.getPublicationYear();
        this.gameGenre = game.getGameGenre();
        this.platforms = game.getPlatforms();
        this.gameScore = game.getGameScore();
        this.coverImgUrl = game.getCoverImgUrl();
        this.shortDescription = game.getShortDescription();
        this.longDescription = game.getLongDescription();
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

    public String getGameGenre() {
        return gameGenre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public Double getGameScore() {
        return gameScore;
    }

    public String getCoverImgUrl() {
        return coverImgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }
}
