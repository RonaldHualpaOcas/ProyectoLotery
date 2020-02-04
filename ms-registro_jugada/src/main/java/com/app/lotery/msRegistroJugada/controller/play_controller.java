package com.app.lotery.msRegistroJugada.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.lotery.msRegistroJugada.exception.ResourceNotFoundException;
import com.app.lotery.msRegistroJugada.model.Play_Entity;
import com.app.lotery.msRegistroJugada.model.Player_Entity;
import com.app.lotery.msRegistroJugada.repository.PlayRepository;
import com.app.lotery.msRegistroJugada.repository.PlayerRepository;

@RestController
@RequestMapping("/Lotery/v1/SetPlay")
public class play_controller {
	
	@Autowired
	private PlayRepository playRepository;
	private PlayerRepository playerRepository;
	
	 @GetMapping("/ShowPlays")
	   public List<Play_Entity> getAllConsultas() {
	     return playRepository.findAll();
	 }
	   
	 @PostMapping("/SetById/{user_id}")
	 	public Play_Entity createPlay(@PathVariable(value = "user_id") Long user_id,
	 			@Valid @RequestBody Play_Entity playDetails) throws ResourceNotFoundException {
		 {
		 
			 Player_Entity player = playerRepository.findById(user_id)
				        .orElseThrow(() -> new ResourceNotFoundException("Player not found for this id :: " + user_id));

			 
	 }
		 
  }
	   
}
