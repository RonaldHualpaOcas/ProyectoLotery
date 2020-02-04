package com.app.lotery.mssignup.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FOUND)
public class ResourceFoundException extends Exception {

	 private static final long serialVersionUID = 1L;

	    public ResourceFoundException(String message){
	        super(message);
	    }
	    
}
