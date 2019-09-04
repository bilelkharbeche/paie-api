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

import dev.paie.entites.RemunerationEmploye;
import dev.paie.service.RemunerationEmployeService;

/**
 * @author KHARBECHE Bilel
 *
 */
@RestController
@RequestMapping(value = "/remuneration_employe")
public class RemunerationEmployeController {

	/** remunerationEmployeService : RemunerationEmployeService */
	@Autowired
	RemunerationEmployeService remunerationEmployeService;

	/**
	 * @return la liste des rémunérations employés
	 */
	@GetMapping
	public List<AfficherEmployeDTO> afficherRemunerationEmploye() {

		List<RemunerationEmploye> listeEmp = remunerationEmployeService.afficherListeEmploye();
		List<AfficherEmployeDTO> listeEmpDTO = new ArrayList<>();

		for (RemunerationEmploye em : listeEmp) {

			AfficherEmployeDTO employeDTO = new AfficherEmployeDTO(em.getDate(), em.getMatricule(),
					em.getGrade().getCode());

			listeEmpDTO.add(employeDTO);
		}

		return listeEmpDTO;
	}

	/**
	 * @param remuEmpDTO
	 * @return une rémunération employé
	 */
	@PostMapping
	public RemunerationEmploye addRemunerationEmploye(@Valid @RequestBody RemunerationEmployeDTO remuEmpDTO) {

		RemunerationEmploye remuEmp = remunerationEmployeService.ajouterRemunerationEmploye(remuEmpDTO.getMatricule(),
				remuEmpDTO.getEntreprise(), remuEmpDTO.getGrade(), remuEmpDTO.getProfil());

		return remuEmp;
	}

	// Pour matricule @GetMappin(params = "matricules")

}
