package com.jealcode.bundle.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jealcode.bundle.rest.model.Prueba;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class PruebaController {


	@GetMapping("/prueba")
	public ResponseEntity<Prueba> getPrueba() {
		try {
			Prueba prueba = new Prueba("@GetMapping", 1);
			return new ResponseEntity<>(prueba, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping(value = "/prueba")
	public ResponseEntity<Prueba> postCustomer(@RequestBody Prueba prueba) {
		try {
			System.out.println(prueba);
			return new ResponseEntity<>(prueba, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
	}
}
