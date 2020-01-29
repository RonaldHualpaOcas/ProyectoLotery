package com.app.lotery.mslogin.controller;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@PostMapping("/checkUsers/logon")
	public void checkTypeUser(@Valid @RequestBody LoginData dataDetails) throws ResourceNotFoundException {
		
		if (dataDetails.getEmail().equalsIgnoreCase("admin@lotery.com") && dataDetails.getPassword().equalsIgnoreCase("admin")) {
			System.out.println("correct admin Auth");
			
		} else {
			System.out.println("User logged as: " + dataDetails.getName().toString() + " " + dataDetails.getLast_name().toString());
		}
	}
	
	@GetMapping("/checkUsers")
    public List<LoginData> getAllEmployees() {
        return dataRepository.findAll();
    }
	
}
