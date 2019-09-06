package dev.paie.entites;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author KHARBECHE Bilel
 *
 */
public class Collegue {

	/** id : Integer */
	private Integer id;
	/** matricule : String */
	private String matricule;
	/** nom : String */
	private String nom;
	/** prenoms : String */
	private String prenoms;
	/** email : String */
	private String email;
	/** dateDeNaissance : LocalDate */
	private LocalDate dateDeNaissance;
	/** photoUrl : String */
	private String photoUrl;
	/** motDePasse : String */
	private String motDePasse;

	private List<String> roles = new ArrayList<>();

	/**
	 * Constructor
	 * 
	 */
	public Collegue() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param matricule
	 * @param nom
	 * @param prenoms
	 * @param email
	 * @param dateDeNaissance
	 * @param photoUrl
	 */
	public Collegue(String matricule, String nom, String prenoms, String email, LocalDate dateDeNaissance,
			String photoUrl, String motDePasse, List<String> roles) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenoms = prenoms;
		this.email = email;
		this.dateDeNaissance = dateDeNaissance;
		this.photoUrl = photoUrl;
		this.motDePasse = motDePasse;
		this.roles = roles;
	}

	/**
	 * Constructor
	 * 
	 * @param nom
	 * @param prenoms
	 * @param email
	 * @param dateDeNaissance
	 * @param photoUrl
	 */
	public Collegue(String nom, String prenoms, String email, LocalDate dateDeNaissance, String photoUrl) {
		super();
		this.nom = nom;
		this.prenoms = prenoms;
		this.email = email;
		this.dateDeNaissance = dateDeNaissance;
		this.photoUrl = photoUrl;
	}

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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the prenoms
	 */
	public String getPrenoms() {
		return prenoms;
	}

	/**
	 * Setter
	 * 
	 * @param prenoms
	 *            the prenoms to set
	 */
	public void setPrenoms(String prenoms) {
		this.prenoms = prenoms;
	}

	/**
	 * Getter
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter
	 * 
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Getter
	 * 
	 * @return the dateDeNaissance
	 */
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	/**
	 * Setter
	 * 
	 * @param dateDeNaissance
	 *            the dateDeNaissance to set
	 */
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	/**
	 * Getter
	 * 
	 * @return the photoUrl
	 */
	public String getPhotoUrl() {
		return photoUrl;
	}

	/**
	 * Setter
	 * 
	 * @param photoUrl
	 *            the photoUrl to set
	 */
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	/**
	 * Getter
	 * 
	 * @return the motDePasse
	 */
	public String getMotDePasse() {
		return motDePasse;
	}

	/**
	 * Setter
	 * 
	 * @param motDePasse
	 *            the motDePasse to set
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	/**
	 * Getter
	 * 
	 * @return the roles
	 */
	public List<String> getRoles() {
		return roles;
	}

	/**
	 * Setter
	 * 
	 * @param roles
	 *            the roles to set
	 */
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

}
