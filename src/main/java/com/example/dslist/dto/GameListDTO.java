package com.example.dslist.dto;

import com.example.dslist.entities.GameList;

import java.util.Objects;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO() {
    }

    public GameListDTO(GameList gameList) {
        this.name = gameList.getName();
        this.id = gameList.getId();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        GameListDTO that = (GameListDTO) object;
        return Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
