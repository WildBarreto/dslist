package com.wild.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wild.dslist.dto.GameMinDTO;
import com.wild.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> finAll(){
		List<GameMinDTO> result = gameService.finAll();
		return result;
	}
}
