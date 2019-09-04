package dev.paie.controller;

import javax.validation.constraints.NotBlank;

/**
 * @author KHARBECHE Bilel
 *
 */
public class RemunerationEmployeDTO {

	@NotBlank
	/** matricule : String */
	private String matricule;
	@NotBlank
	/** entreprise : String */
	private String entreprise;
	@NotBlank
	/** profil : String */
	private String profil;
	@NotBlank
	/** grade : String */
	private String grade;

	/**
	 * Constructor
	 * 
	 */
	public RemunerationEmployeDTO() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param matricule
	 * @param entreprise
	 * @param grade
	 * @param profil
	 */
	public RemunerationEmployeDTO(String matricule, String entreprise, String grade, String profil) {
		super();
		this.matricule = matricule;
		this.entreprise = entreprise;
		this.grade = grade;
		this.profil = profil;
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
	 * @return the entreprise
	 */
	public String getEntreprise() {
		return entreprise;
	}

	/**
	 * Setter
	 * 
	 * @param entreprise
	 *            the entreprise to set
	 */
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	/**
	 * Getter
	 * 
	 * @return the profil
	 */
	public String getProfil() {
		return profil;
	}

	/**
	 * Setter
	 * 
	 * @param profil
	 *            the profil to set
	 */
	public void setProfil(String profil) {
		this.profil = profil;
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
