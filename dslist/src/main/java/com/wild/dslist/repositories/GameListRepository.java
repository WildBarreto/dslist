package com.wild.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wild.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
