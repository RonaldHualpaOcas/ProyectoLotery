package com.app.lotery.msGenerarJugada.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.lotery.msGenerarJugada.model.Main_Entity;
import com.app.lotery.msGenerarJugada.repository.MainRepository;
import com.app.lotery.msGenerarJugada.exception.ResourceNotFoundException;


@RestController
@RequestMapping("/Lotery/v1/GeneratePlay")
public class Play_Generator_Controller {

	@Autowired
	private MainRepository mainRepository;
	
	
	 @GetMapping("/MainData")
	   public List<Main_Entity> getAllConsultas() {
	     return mainRepository.findAll();
	   }
	   
	 @GetMapping("/NewPlay")
	 	public ResponseEntity<Main_Entity> generateNewPlay() throws ResourceNotFoundException {
	 		
	 	 long repo_id = 1;
	     Main_Entity baseElement = mainRepository.findById(repo_id)
	    		 .orElseThrow(() -> new ResourceNotFoundException("Resource not found for this id :: " + repo_id));;
	 		
		 Random r = new Random();
		 int[] ballsArray = new int[20];
		 
		 for (int i=0; i<20; i++) {
			 int generatedNumber = r.nextInt((20 - 1) + 1) + 1;
			 ballsArray[i] = generatedNumber;
		 }
		 
		 
		 baseElement.setGenerated_balls(ballsArray);
		 final Main_Entity updatedMain = mainRepository.save(baseElement);
		 
		 return ResponseEntity.ok(updatedMain);
		 
	 }

}