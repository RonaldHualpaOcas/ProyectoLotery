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
	public void checkUserExistance(@Valid @RequestBody LoginData dataDetails) 
			throws ResourceNotFoundException {
		
		List<LoginData> listaDatos = dataRepository.findAll();
		int i = 0;
		boolean encontrado = false;
		while (encontrado == false) {
			if(listaDatos.get(i).getEmail().toString().equalsIgnoreCase(dataDetails.getEmail().toString())
			   && listaDatos.get(i).getPassword().toString().equalsIgnoreCase(dataDetails.getPassword().toString())) {
				encontrado = true;
			}
			i++;
		}
		
		if(encontrado == true) {
			System.out.println("User exists");			
		} else {
			System.out.println("The user doesn't exist");
		}
		
		if (dataDetails.getEmail().equalsIgnoreCase("admin@lotery.com") && dataDetails.getPassword().equalsIgnoreCase("admin")) {
			System.out.println("Correct admin authentication");
			
		} else {
			System.out.println("User logged as: " + dataDetails.getEmail().toString());
		}
	}
	
	@GetMapping("/checkUsers")
    public List<LoginData> getAllEmployees() {
        return dataRepository.findAll();
    }
	
}
