package com.example.dslist.projections;

public interface GameMinProjection {

    Long getId();
    String getGameTitle();
    Integer getPublicationYear();
    String getCoverImgUrl();
    String getShortDescription();
    Integer getGamePosition();
}
