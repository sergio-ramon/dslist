package com.example.dslist.services;

import com.example.dslist.dto.GameMinDTO;
import com.example.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        return gameRepository.findAll().stream().map(g -> new GameMinDTO(g)).toList();
    }
}
