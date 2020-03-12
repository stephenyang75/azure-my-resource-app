package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/userprovisioning-ms")
public class UserProvisioningController {
	private static final Logger logger = LoggerFactory.getLogger(UserProvisioningController.class);
	
    @GetMapping(value = "/")
    @ResponseStatus(HttpStatus.OK)    
    public ResponseEntity<String> grant() {
    	logger.debug("entering grant method");
		ResponseEntity<String> resEntity = new ResponseEntity<>("User is Granted", HttpStatus.OK);
    	logger.debug("leaving grant method");	    	
		return resEntity;
    }

}
