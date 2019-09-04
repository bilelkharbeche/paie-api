package dev.paie.controller;

/**
 * @author KHARBECHE Bilel
 *
 */
public class GradeDTO {

	/** code : String */
	private String code;

	/**
	 * Constructor
	 * 
	 */
	public GradeDTO() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param code
	 */
	public GradeDTO(String code) {
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
