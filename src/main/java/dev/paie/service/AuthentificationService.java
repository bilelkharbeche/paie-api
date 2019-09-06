package dev.paie.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import dev.paie.entites.InfosAuthentificationPost;

@Service
public class AuthentificationService {

	RestTemplate rt = new RestTemplate();

	private String urlCollegueApi = "https://kharbeche-collegues-api.herokuapp.com";

	public ResponseEntity<?> authenticate(InfosAuthentificationPost infos) {

		return rt.postForEntity(urlCollegueApi + "/auth", infos, String.class);
	}
}
