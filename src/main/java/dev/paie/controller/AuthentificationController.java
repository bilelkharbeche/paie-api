package dev.paie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.paie.entites.InfosAuthentificationPost;
import dev.paie.service.AuthentificationService;

@RestController
public class AuthentificationController {

	@Autowired
	AuthentificationService authentificationService;

	@PostMapping("/auth")
	public ResponseEntity<?> authenticate(@RequestBody InfosAuthentificationPost infos) {

		return authentificationService.authenticate(infos);

	}

}
