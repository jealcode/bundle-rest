package com.jealcode.bundle.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jealcode.bundle.rest.model.Prueba;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class PruebaController {

	@PostMapping("/prueba")
	public ResponseEntity<Prueba> setPrueba() {
		try {
			Prueba prueba = new Prueba("post", 19);
			return new ResponseEntity<>(prueba, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/prueba")
	public ResponseEntity<Prueba> getPrueba() {
		try {
			Prueba prueba = new Prueba("Jesus", 19);
			return new ResponseEntity<>(prueba, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
