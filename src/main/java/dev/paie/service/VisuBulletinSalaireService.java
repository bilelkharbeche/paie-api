package dev.paie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.paie.repository.BulletinSalaireRepository;
import dev.paie.repository.EntrepriseRepository;
import dev.paie.repository.PeriodeRepository;
import dev.paie.repository.RemunerationEmployeRepository;

/**
 * @author KHARBECHE Bilel
 *
 */
@Component
public class VisuBulletinSalaireService {

	/** remunEmpRepo : RemunerationEmployeRepository */
	@Autowired
	private RemunerationEmployeRepository remunEmpRepo;
	/** entrepriseRepo : EntrepriseRepository */
	@Autowired
	private EntrepriseRepository entrepriseRepo;
	/** periodeRepo : PeriodeRepository */
	@Autowired
	private PeriodeRepository periodeRepo;
	/** bulletinRepo : BulletinSalaireRepository */
	@Autowired
	private BulletinSalaireRepository bulletinRepo;

	/**
	 * @return
	 */
	// public VisuBulletinSalaireDTO VisualiserBulletin(BulletinSalaire
	// bulletin) {

	// VisuBulletinSalaireDTO bulletinSal = new VisuBulletinSalaireDTO();
	//
	// String codeEnt =
	// bulletin.getRemunerationEmploye().getEntreprise().getCode();
	// String siretEnt =
	// bulletin.getRemunerationEmploye().getEntreprise().getSiret();
	//
	// String matricule = bulletin.getRemunerationEmploye().getMatricule();
	//
	// Periode periode = bulletin.getPeriode();
	//
	// return null;
	// }

}
