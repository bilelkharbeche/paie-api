package dev.paie.service;

import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import dev.paie.entites.Collegue;
import dev.paie.entites.Entreprise;
import dev.paie.entites.Grade;
import dev.paie.entites.ProfilRemuneration;
import dev.paie.entites.RemunerationEmploye;
import dev.paie.repository.EntrepriseRepository;
import dev.paie.repository.GradeRepository;
import dev.paie.repository.ProfilRemunerationRepository;
import dev.paie.repository.RemunerationEmployeRepository;

/**
 * @author KHARBECHE Bilel
 *
 */
@Component
public class RemunerationEmployeService {

	/** remunerationEmpRepo : RemunerationEmployeRepository */
	@Autowired
	private RemunerationEmployeRepository remunerationEmpRepo;
	/** entrepriseRepo : EntrepriseRepository */
	@Autowired
	private EntrepriseRepository entrepriseRepo;
	/** profilRepo : ProfilRemunerationRepository */
	@Autowired
	private ProfilRemunerationRepository profilRepo;
	/** gradeRepo : GradeRepository */
	@Autowired
	private GradeRepository gradeRepo;

	/**
	 * @param matricule
	 * @param codeEntreprise
	 * @param codeGrade
	 * @param codeProfil
	 * @return une rémunération d'employé
	 */
	public RemunerationEmploye ajouterRemunerationEmploye(String matricule, String codeEntreprise, String codeGrade,
			String codeProfil) {

		RestTemplate rt = new RestTemplate();
		Collegue result = rt.getForObject("https://kharbeche-collegues-api.herokuapp.com/collegues/{matricule}",
				Collegue.class, matricule);

		String m = result.getMatricule();
		Entreprise e = entrepriseRepo.findByCode(codeEntreprise);
		Grade g = gradeRepo.findByCode(codeGrade);
		ProfilRemuneration pr = profilRepo.findByCode(codeProfil);

		RemunerationEmploye remunerationEmploye = new RemunerationEmploye();

		remunerationEmploye.setMatricule(m);
		remunerationEmploye.setEntreprise(e);
		remunerationEmploye.setGrade(g);
		remunerationEmploye.setProfilRemuneration(pr);
		remunerationEmploye.setDate(ZonedDateTime.now());

		remunerationEmpRepo.save(remunerationEmploye);
		return remunerationEmploye;
	}

	/**
	 * @return la liste des rémunérations employés
	 */
	public List<RemunerationEmploye> afficherListeEmploye() {

		List<RemunerationEmploye> listEmp = remunerationEmpRepo.findAll();

		return listEmp;
	}

}
