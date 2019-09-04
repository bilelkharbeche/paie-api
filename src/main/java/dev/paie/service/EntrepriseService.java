package dev.paie.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.paie.entites.Entreprise;
import dev.paie.repository.EntrepriseRepository;

/**
 * @author KHARBECHE Bilel
 *
 */
@Component
public class EntrepriseService {

	/** LOG : Logger */
	private static final Logger LOG = LoggerFactory.getLogger(EntrepriseService.class);

	/** paieRepository : PaieRepository */
	@Autowired
	private EntrepriseRepository paieRepository;

	/**
	 * @return la liste des entreprises
	 */
	public List<Entreprise> rechercheEntreprise() {

		List<Entreprise> listeEnt = paieRepository.findAll();

		return listeEnt;
	}

}