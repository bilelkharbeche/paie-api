package dev.paie.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Entreprise {

	/** id : Integer */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/** code : String */
	private String code;
	/** siret : String */
	private String siret;
	/** denomination : String */
	private String denomination;
	/** adresse : String */
	private String adresse;
	/** urssaf : String */
	private String urssaf;
	/** codeNaf : String */
	private String codeNaf;

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
	 * @return the siret
	 */
	public String getSiret() {
		return siret;
	}

	/**
	 * Setter
	 * 
	 * @param siret
	 *            the siret to set
	 */
	public void setSiret(String siret) {
		this.siret = siret;
	}

	/**
	 * Getter
	 * 
	 * @return the denomination
	 */
	public String getDenomination() {
		return denomination;
	}

	/**
	 * Setter
	 * 
	 * @param denomination
	 *            the denomination to set
	 */
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	/**
	 * Getter
	 * 
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Setter
	 * 
	 * @param adresse
	 *            the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter
	 * 
	 * @return the urssaf
	 */
	public String getUrssaf() {
		return urssaf;
	}

	/**
	 * Setter
	 * 
	 * @param urssaf
	 *            the urssaf to set
	 */
	public void setUrssaf(String urssaf) {
		this.urssaf = urssaf;
	}

	/**
	 * Getter
	 * 
	 * @return the codeNaf
	 */
	public String getCodeNaf() {
		return codeNaf;
	}

	/**
	 * Setter
	 * 
	 * @param codeNaf
	 *            the codeNaf to set
	 */
	public void setCodeNaf(String codeNaf) {
		this.codeNaf = codeNaf;
	}

}
