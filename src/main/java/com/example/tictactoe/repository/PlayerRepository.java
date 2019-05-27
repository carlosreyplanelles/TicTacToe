package com.example.tictactoe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tictactoe.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
