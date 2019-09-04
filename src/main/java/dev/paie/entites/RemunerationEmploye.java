package dev.paie.entites;

import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author KHARBECHE Bilel
 *
 */
@Entity
@Table
public class RemunerationEmploye {

	/** id : Integer */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/** matricule : String */
	private String matricule;
	@ManyToOne
	@JoinColumn(name = "entreprise_id")
	/** entreprise : Entreprise */
	private Entreprise entreprise;
	@ManyToOne
	@JoinColumn(name = "profilRemuneration_id")
	/** profilRemuneration : ProfilRemuneration */
	private ProfilRemuneration profil;
	@OneToOne
	/** grade : Grade */
	private Grade grade;
	/** date : ZonedDateTime */
	private ZonedDateTime date;

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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
	public Entreprise getEntreprise() {
		return entreprise;
	}

	/**
	 * Setter
	 * 
	 * @param entreprise
	 *            the entreprise to set
	 */
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	/**
	 * Getter
	 * 
	 * @return the profilRemuneration
	 */
	public ProfilRemuneration getProfilRemuneration() {
		return profil;
	}

	/**
	 * Setter
	 * 
	 * @param profilRemuneration
	 *            the profilRemuneration to set
	 */
	public void setProfilRemuneration(ProfilRemuneration profil) {
		this.profil = profil;
	}

	/**
	 * Getter
	 * 
	 * @return the grade
	 */
	public Grade getGrade() {
		return grade;
	}

	/**
	 * Setter
	 * 
	 * @param grade
	 *            the grade to set
	 */
	public void setGrade(Grade grade) {
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

}
