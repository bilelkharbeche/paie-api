package dev.paie.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.paie.entites.ProfilRemuneration;
import dev.paie.service.ProfilService;

/**
 * @author KHARBECHE Bilel
 *
 */
@RestController
public class ProfilRemunerationController {

	/** collegueService : PaieService */
	@Autowired
	ProfilService profilService;

	/**
	 * @return la liste des profils
	 */
	@RequestMapping(value = "/profils_remuneration", method = RequestMethod.GET)
	public List<ProfilRemunerationDTO> findProfil() {

		List<ProfilRemuneration> listeProfil = profilService.rechercheProfil();
		List<ProfilRemunerationDTO> listeProfilDTO = new ArrayList<>();

		for (ProfilRemuneration pr : listeProfil) {
			ProfilRemunerationDTO profilDTO = new ProfilRemunerationDTO(pr.getCode());

			listeProfilDTO.add(profilDTO);
		}
		return listeProfilDTO;
	}

}
