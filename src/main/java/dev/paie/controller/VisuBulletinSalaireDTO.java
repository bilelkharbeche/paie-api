package dev.paie.controller;

import dev.paie.entites.Collegue;
import dev.paie.entites.Cotisation;
import dev.paie.entites.Periode;

/**
 * @author KHARBECHE Bilel
 *
 */
public class VisuBulletinSalaireDTO {

	/** entreprise : EntrepriseDTO */
	private EntrepriseDTO entreprise;
	/** periode : Periode */
	private Periode periode;
	/** collegue : Collegue */
	private Collegue collegue;
	/** bulletin : BulletinSalaireDTO */
	private BulletinSalaireDTO bulletin;
	/** salaire : CalculSalaireDTO */
	private CalculSalaireDTO salaire;
	/** cotisation : Cotisation */
	private Cotisation cotisation;

	/**
	 * Constructor
	 * 
	 */
	public VisuBulletinSalaireDTO() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param entreprise
	 * @param periode
	 * @param collegue
	 * @param bulletin
	 * @param salaire
	 * @param cotisation
	 */
	public VisuBulletinSalaireDTO(EntrepriseDTO entreprise, Periode periode, Collegue collegue,
			BulletinSalaireDTO bulletin, CalculSalaireDTO salaire, Cotisation cotisation) {
		super();
		this.entreprise = entreprise;
		this.periode = periode;
		this.collegue = collegue;
		this.bulletin = bulletin;
		this.salaire = salaire;
		this.cotisation = cotisation;
	}

	/**
	 * Getter
	 * 
	 * @return the entreprise
	 */
	public EntrepriseDTO getEntreprise() {
		return entreprise;
	}

	/**
	 * Setter
	 * 
	 * @param entreprise
	 *            the entreprise to set
	 */
	public void setEntreprise(EntrepriseDTO entreprise) {
		this.entreprise = entreprise;
	}

	/**
	 * Getter
	 * 
	 * @return the periode
	 */
	public Periode getPeriode() {
		return periode;
	}

	/**
	 * Setter
	 * 
	 * @param periode
	 *            the periode to set
	 */
	public void setPeriode(Periode periode) {
		this.periode = periode;
	}

	/**
	 * Getter
	 * 
	 * @return the collegue
	 */
	public Collegue getCollegue() {
		return collegue;
	}

	/**
	 * Setter
	 * 
	 * @param collegue
	 *            the collegue to set
	 */
	public void setCollegue(Collegue collegue) {
		this.collegue = collegue;
	}

	/**
	 * Getter
	 * 
	 * @return the bulletin
	 */
	public BulletinSalaireDTO getBulletin() {
		return bulletin;
	}

	/**
	 * Setter
	 * 
	 * @param bulletin
	 *            the bulletin to set
	 */
	public void setBulletin(BulletinSalaireDTO bulletin) {
		this.bulletin = bulletin;
	}

	/**
	 * Getter
	 * 
	 * @return the salaire
	 */
	public CalculSalaireDTO getSalaire() {
		return salaire;
	}

	/**
	 * Setter
	 * 
	 * @param salaire
	 *            the salaire to set
	 */
	public void setSalaire(CalculSalaireDTO salaire) {
		this.salaire = salaire;
	}

	/**
	 * Getter
	 * 
	 * @return the cotisation
	 */
	public Cotisation getCotisation() {
		return cotisation;
	}

	/**
	 * Setter
	 * 
	 * @param cotisation
	 *            the cotisation to set
	 */
	public void setCotisation(Cotisation cotisation) {
		this.cotisation = cotisation;
	}

}
