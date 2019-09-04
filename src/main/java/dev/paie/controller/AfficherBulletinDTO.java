package dev.paie.controller;

import java.time.ZonedDateTime;

import dev.paie.entites.Periode;

/**
 * @author KHARBECHE Bilel
 *
 */
public class AfficherBulletinDTO {

	/** date : ZonedDateTime */
	private ZonedDateTime date;
	/** periode : String */
	private Periode periode;
	/** matricule : String */
	private String matricule;
	/** salaire : CalculSalaireDTO */
	private CalculSalaireDTO salaire;

	/**
	 * Constructor
	 * 
	 */
	public AfficherBulletinDTO() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param date
	 * @param periode
	 * @param matricule
	 * @param salaire
	 */
	public AfficherBulletinDTO(ZonedDateTime date, Periode periode, String matricule, CalculSalaireDTO salaire) {
		super();
		this.date = date;
		this.periode = periode;
		this.matricule = matricule;
		this.salaire = salaire;
	}

	/**
	 * Getter
	 * 
	 * @return the date
	 */
	public ZonedDateTime getDate() {
		return date;
	}

	/**
	 * Setter
	 * 
	 * @param date
	 *            the date to set
	 */
	public void setDate(ZonedDateTime date) {
		this.date = date;
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
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/**
	 * Setter
	 * 
	 * @param matricule
	 *            the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
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

}
