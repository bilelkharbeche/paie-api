package dev.paie.entites;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author KHARBECHE Bilel
 *
 */
@Entity
@Table
public class ProfilRemuneration {

	/** id : Integer */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/** code : String */
	private String code;
	@ManyToMany
	@JoinTable(name = "profil_remuneration_cotisation", joinColumns = @JoinColumn(name = "profil_remuneration_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "cotisation_id", referencedColumnName = "id"))
	/** cotisations : List<Cotisation> */
	private List<Cotisation> cotisations;

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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Setter
	 * 
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Getter
	 * 
	 * @return the cotisations
	 */
	public List<Cotisation> getCotisations() {
		return cotisations;
	}

	/**
	 * Setter
	 * 
	 * @param cotisations
	 *            the cotisations to set
	 */
	public void setCotisations(List<Cotisation> cotisations) {
		this.cotisations = cotisations;
	}

}
