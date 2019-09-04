package dev.paie.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.paie.controller.CalculSalaireDTO;
import dev.paie.entites.BulletinSalaire;
import dev.paie.entites.Cotisation;
import dev.paie.entites.Periode;
import dev.paie.entites.RemunerationEmploye;
import dev.paie.repository.BulletinSalaireRepository;
import dev.paie.repository.PeriodeRepository;
import dev.paie.repository.RemunerationEmployeRepository;

/**
 * @author KHARBECHE Bilel
 *
 */
@Component
public class BulletinSalaireService {

	/** LOG : Logger */
	private static final Logger LOG = LoggerFactory.getLogger(BulletinSalaireService.class);

	/** bulletinSalRepo : BulletinSalaireRepository */
	@Autowired
	private BulletinSalaireRepository bulletinSalRepo;
	/** periodeRepo : PeriodeRepository */
	@Autowired
	private PeriodeRepository periodeRepo;
	/** remunEmpRepo : RemunerationEmployeRepository */
	@Autowired
	private RemunerationEmployeRepository remunEmpRepo;

	/**
	 * @param periode
	 * @param matricule
	 * @param primeExceptionnelle
	 * @return un bulletin de salaire
	 */
	public BulletinSalaire ajouterBulletinSalaire(Integer periode, String matricule, BigDecimal primeExceptionnelle) {

		// String m = result.getMatricule();
		RemunerationEmploye rEmp = remunEmpRepo.findByMatricule(matricule);

		Optional<Periode> optPeriode = periodeRepo.findById(periode);
		Periode p = optPeriode.orElseThrow(() -> new RuntimeException("id période non trouvé "));

		BulletinSalaire bulletinSalaire = new BulletinSalaire();

		bulletinSalaire.setPeriode(p);
		bulletinSalaire.setRemunerationEmploye(rEmp);
		bulletinSalaire.setPrimeExceptionnelle(primeExceptionnelle);

		bulletinSalRepo.save(bulletinSalaire);

		return bulletinSalaire;
	}

	/**
	 * @return la liste des bulletins de salaire
	 */
	public List<BulletinSalaire> afficherListeBulletin() {

		List<BulletinSalaire> bulletinSalaire = bulletinSalRepo.findAll();

		return bulletinSalaire;
	}

	/**
	 * @param bulletinSalaire
	 * @return le salaire d'un employé
	 */
	public CalculSalaireDTO calculSalaire(BulletinSalaire bulletinSalaire) {

		CalculSalaireDTO salaire = new CalculSalaireDTO();

		BigDecimal chargeNImposable = new BigDecimal(0);
		BigDecimal chargeImposable = new BigDecimal(0);

		BigDecimal salaireNetImposable = new BigDecimal(0);
		BigDecimal salaireNetAPayer = new BigDecimal(0);

		BigDecimal tauxBase = bulletinSalaire.getRemunerationEmploye().getGrade().getTauxBase();
		BigDecimal tauxHoraire = bulletinSalaire.getRemunerationEmploye().getGrade().getNbHeuresBase();
		BigDecimal prime = bulletinSalaire.getPrimeExceptionnelle();

		BigDecimal salaireBrut = tauxBase.multiply(tauxHoraire).add(prime);

		List<Cotisation> listeCotisation = bulletinSalaire.getRemunerationEmploye().getProfilRemuneration()
				.getCotisations();

		for (Cotisation cotisation : listeCotisation) {
			if (cotisation.getTauxSalarial() != null) {
				if (cotisation.getImposable() == true)
					chargeImposable = chargeImposable.add(cotisation.getTauxSalarial().multiply(salaireBrut));
				else
					chargeNImposable = chargeNImposable.add(cotisation.getTauxSalarial().multiply(salaireBrut));
			}
		}

		salaireNetImposable = salaireBrut.subtract(chargeNImposable);
		salaireNetAPayer = salaireNetImposable.subtract(chargeImposable);

		salaire.setSalaireBrut(salaireBrut);
		salaire.setNetImposable(salaireNetImposable);
		salaire.setNetAPayer(salaireNetAPayer);

		return salaire;
	}

}
