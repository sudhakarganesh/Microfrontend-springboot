package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Sudhakar K.
 *
 */
@CrossOrigin(origins = "*")
@RestController
public class TestRestServiceCall {
	
    @RequestMapping(value = "/test-rest-api", method = RequestMethod.GET)
    public ResponseEntity<String> fetchInputData() throws Exception{ 
    	return new ResponseEntity<String>("success",HttpStatus.OK);
    }

}
