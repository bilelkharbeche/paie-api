package dev.paie.controller;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author KHARBECHE Bilel
 *
 */
public class BulletinSalaireDTO {

	@NotNull
	/** periode : String */
	private Integer periode;
	@NotBlank
	/** matricule : String */
	private String matricule;
	@NotNull
	@Column(precision = 6, scale = 2)
	/** primeExceptionnelle : String */
	private BigDecimal primeExceptionnelle;

	/**
	 * Constructor
	 * 
	 */
	public BulletinSalaireDTO() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param periode
	 * @param matricule
	 * @param primeExceptionnelle
	 */
	public BulletinSalaireDTO(Integer periode, String matricule, BigDecimal primeExceptionnelle) {
		super();
		this.periode = periode;
		this.matricule = matricule;
		this.primeExceptionnelle = primeExceptionnelle;
	}

	/**
	 * Getter
	 * 
	 * @return the periode
	 */
	public Integer getPeriode() {
		return periode;
	}

	/**
	 * Setter
	 * 
	 * @param periode
	 *            the periode to set
	 */
	public void setPeriode(Integer periode) {
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
	 * @return the primeExceptionnelle
	 */
	public BigDecimal getPrimeExceptionnelle() {
		return primeExceptionnelle;
	}

	/**
	 * Setter
	 * 
	 * @param primeExceptionnelle
	 *            the primeExceptionnelle to set
	 */
	public void setPrimeExceptionnelle(BigDecimal primeExceptionnelle) {
		this.primeExceptionnelle = primeExceptionnelle;
	}

}
