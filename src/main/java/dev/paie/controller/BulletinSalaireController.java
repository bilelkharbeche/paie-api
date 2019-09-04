package dev.paie.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.paie.entites.BulletinSalaire;
import dev.paie.service.BulletinSalaireService;

/**
 * @author KHARBECHE Bilel
 *
 */
@RestController
@RequestMapping(value = "/bulletin_salaire")
public class BulletinSalaireController {

	@Autowired
	/** bulletinSalService : BulletinSalaireService */
	BulletinSalaireService bulletinSalService;

	/**
	 * @return la liste des bulletins de salaire
	 */
	@GetMapping
	public List<AfficherBulletinDTO> afficherBulletinSalaire() {

		List<BulletinSalaire> bulletinSalaire = bulletinSalService.afficherListeBulletin();
		List<AfficherBulletinDTO> bulletinSalaireDTO = new ArrayList<>();

		for (BulletinSalaire bs : bulletinSalaire) {

			AfficherBulletinDTO bulletinDTO = new AfficherBulletinDTO(bs.getRemunerationEmploye().getDate(),
					bs.getPeriode(), bs.getRemunerationEmploye().getMatricule(), bulletinSalService.calculSalaire(bs));

			bulletinSalaireDTO.add(bulletinDTO);
		}

		return bulletinSalaireDTO;
	}

	/**
	 * @param bullSalDTO
	 * @return un bulletin de salaire
	 */
	@PostMapping
	public BulletinSalaire addBulletinSalaire(@Valid @RequestBody BulletinSalaireDTO bullSalDTO) {

		BulletinSalaire bullSal = bulletinSalService.ajouterBulletinSalaire(bullSalDTO.getPeriode(),
				bullSalDTO.getMatricule(), bullSalDTO.getPrimeExceptionnelle());

		return bullSal;
	}

}
