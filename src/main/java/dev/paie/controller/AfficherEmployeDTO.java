package dev.paie.controller;

import java.time.ZonedDateTime;

/**
 * @author KHARBECHE Bilel
 *
 */
public class AfficherEmployeDTO {

	/** date : ZonedDateTime */
	private ZonedDateTime date;
	/** matricule : String */
	private String matricule;
	/** grade : String */
	private String grade;

	/**
	 * Constructor
	 * 
	 */
	public AfficherEmployeDTO() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param date
	 * @param matricule
	 * @param grade
	 */
	public AfficherEmployeDTO(ZonedDateTime date, String matricule, String grade) {
		super();
		this.date = date;
		this.matricule = matricule;
		this.grade = grade;
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
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * Setter
	 * 
	 * @param grade
	 *            the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
