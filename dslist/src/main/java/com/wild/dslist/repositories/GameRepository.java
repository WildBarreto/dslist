package com.wild.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wild.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
