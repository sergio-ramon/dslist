package com.example.dslist.entities;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer gamePosition;

    public Belonging() {
    }

    public Belonging(Game game, GameList gameList, Integer gamePosition) {
        this.id.setGame(game);
        this.id.setGameList(gameList);
        this.gamePosition = gamePosition;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Belonging belonging = (Belonging) object;
        return Objects.equals(getId(), belonging.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getGamePosition() {
        return gamePosition;
    }

    public void setGamePosition(Integer gamePosition) {
        this.gamePosition = gamePosition;
    }
}
