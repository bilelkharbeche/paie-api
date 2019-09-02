package dev.paie.entites;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cotisation {

	/** id : Integer */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/** code : String */
	private String code;
	/** libelle : String */
	private String libelle;
	@Column(precision = 10, scale = 6)
	/** tauxSalarial : BigDecimal */
	private BigDecimal tauxSalarial;
	@Column(precision = 10, scale = 6)
	/** tauxPatronal : BigDecimal */
	private BigDecimal tauxPatronal;
	/** imposable : Boolean */
	private Boolean imposable = false;

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
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setter
	 * 
	 * @param libelle
	 *            the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Getter
	 * 
	 * @return the tauxSalarial
	 */
	public BigDecimal getTauxSalarial() {
		return tauxSalarial;
	}

	/**
	 * Setter
	 * 
	 * @param tauxSalarial
	 *            the tauxSalarial to set
	 */
	public void setTauxSalarial(BigDecimal tauxSalarial) {
		this.tauxSalarial = tauxSalarial;
	}

	/**
	 * Getter
	 * 
	 * @return the tauxPatronal
	 */
	public BigDecimal getTauxPatronal() {
		return tauxPatronal;
	}

	/**
	 * Setter
	 * 
	 * @param tauxPatronal
	 *            the tauxPatronal to set
	 */
	public void setTauxPatronal(BigDecimal tauxPatronal) {
		this.tauxPatronal = tauxPatronal;
	}

	/**
	 * Getter
	 * 
	 * @return the imposable
	 */
	public Boolean getImposable() {
		return imposable;
	}

	/**
	 * Setter
	 * 
	 * @param imposable
	 *            the imposable to set
	 */
	public void setImposable(Boolean imposable) {
		this.imposable = imposable;
	}

}
