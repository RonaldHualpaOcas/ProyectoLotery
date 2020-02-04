package com.app.lotery.mssignup.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.lotery.mssignup.exception.ResourceFoundException;
import com.app.lotery.mssignup.model.Signup;
import com.app.lotery.mssignup.repository.SignupRepository;

@RestController
@RequestMapping("/app/lotery/v1")
public class SignupController {

	@Autowired
    private SignupRepository signupRepository;

    @GetMapping("/signups")
    public List<Signup> getAllSignups() {
        return signupRepository.findAll();
    }
	
    @PostMapping("/signups")
    public Signup createSignup(@Valid @RequestBody Signup signup) {
    	
    	return signupRepository.save(signup);
    }
    

}


