package dev.paie.controller;

/**
 * @author KHARBECHE Bilel
 *
 */
public class EntrepriseDTO {

	/** code : String */
	private String code;
	/** denomination : String */
	private String denomination;

	/**
	 * Constructor
	 * 
	 */
	public EntrepriseDTO() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param code
	 * @param denomination
	 */
	public EntrepriseDTO(String code, String denomination) {
		super();
		this.code = code;
		this.denomination = denomination;
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

}
