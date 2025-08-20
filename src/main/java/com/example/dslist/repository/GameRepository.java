package com.example.dslist.repository;

import com.example.dslist.entities.Game;
import com.example.dslist.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(nativeQuery = true, value = """
            SELECT tb_game.id, tb_game.game_title AS `gameTitle`, tb_game.publication_year AS `publicationYear`, tb_game.cover_img_url AS `coverImgUrl`,
            tb_game.short_description AS `shortDescription`, tb_belonging.game_position
            FROM tb_game
            INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
            WHERE tb_belonging.list_id = :listId
            ORDER BY tb_belonging.game_position
            """)
    List<GameMinProjection> searchByList(Long listId);
}
