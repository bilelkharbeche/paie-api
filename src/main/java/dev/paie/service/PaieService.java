package dev.paie.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.paie.entites.Entreprise;
import dev.paie.repository.PaieRepository;

@Component
public class PaieService {

	/** LOG : Logger */
	private static final Logger LOG = LoggerFactory.getLogger(PaieService.class);

	/** paieRepository : PaieRepository */
	@Autowired
	private PaieRepository paieRepository;

	/**
	 * @return listeEnt
	 */
	public List<Entreprise> rechercheEntreprise() {

		List<Entreprise> listeEnt = paieRepository.findAll();

		return listeEnt;
	}

}
