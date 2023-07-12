package com.wild.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wild.dslist.dto.GameListDTO;
import com.wild.dslist.entities.GameList;
import com.wild.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;

	@Transactional(readOnly = true)
	public List<GameListDTO> finAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x ->new GameListDTO(x)).toList();
		
	}
}
