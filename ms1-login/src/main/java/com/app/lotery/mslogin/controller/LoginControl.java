package com.app.lotery.mslogin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.lotery.mslogin.model.LoginData;
import com.app.lotery.mslogin.repository.DataRepository;
import com.app.lotery.mslogin.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/LoteryLogin/v1")
public class LoginControl {
	
	@Autowired
	private DataRepository dataRepository;
	
	@PostMapping("/checkUsers/{id}")
	public void checkTypeUser(@PathVariable(value = "id") Long userID, 
		@Valid @RequestBody LoginData dataDetails) throws ResourceNotFoundException {
		
		LoginData userData = dataRepository.findById(userID)
				.orElseThrow(() -> new ResourceNotFoundException("Data no encontrada para :: " + userID) );
		
		if (dataDetails.getEmail().toString() == "admin@lotery.com" && dataDetails.getPassword().toString() == "admin") {
			System.out.println("correct admin Auth");
		} else {
			System.out.println("User loggued as: " + userData.getName().toString() + userData.getLast_name().toString());
		}
	}
	
	
}
