package dev.paie.controller;

/**
 * @author KHARBECHE Bilel
 *
 */
public class ProfilRemunerationDTO {

	/** code : String */
	String code;

	/**
	 * Constructor
	 * 
	 */
	public ProfilRemunerationDTO() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param code
	 */
	public ProfilRemunerationDTO(String code) {
		super();
		this.code = code;
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

}
