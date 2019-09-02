package dev.paie.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.paie.entites.Entreprise;
import dev.paie.service.PaieService;

@RestController
public class PaieController {

	/** collegueService : PaieService */
	@Autowired
	PaieService paieService;

	/**
	 * @param code
	 * @param denomination
	 * @return listeEntDto
	 */
	@RequestMapping(value = "/entreprises", method = RequestMethod.GET)
	public List<EntrepriseDTO> findEntreprise(String code, String denomination) {

		List<Entreprise> listeEnt = paieService.rechercheEntreprise();
		List<EntrepriseDTO> listeEntDto = new ArrayList<>();

		for (Entreprise en : listeEnt) {

			EntrepriseDTO entDto = new EntrepriseDTO(en.getCode(), en.getDenomination());
			listeEntDto.add(entDto);

		}
		return listeEntDto;
	}

}
