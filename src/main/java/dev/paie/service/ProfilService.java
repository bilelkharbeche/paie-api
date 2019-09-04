package dev.paie.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.paie.entites.ProfilRemuneration;
import dev.paie.repository.ProfilRemunerationRepository;

/**
 * @author KHARBECHE Bilel
 *
 */
@Component
public class ProfilService {

	/** LOG : Logger */
	private static final Logger LOG = LoggerFactory.getLogger(EntrepriseService.class);

	/** profilRemuRepo : ProfilRemunerationRepository */
	@Autowired
	private ProfilRemunerationRepository profilRemuRepo;

	/**
	 * @return la liste des profils
	 */
	public List<ProfilRemuneration> rechercheProfil() {

		List<ProfilRemuneration> listeProfil = profilRemuRepo.findAll();

		return listeProfil;
	}

}
