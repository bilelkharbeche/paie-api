package dev.paie.controller;

import java.math.BigDecimal;

import javax.persistence.Column;

/**
 * @author KHARBECHE Bilel
 *
 */
public class CalculSalaireDTO {

	@Column(precision = 6, scale = 2)
	/** salaireBrut : BigDecimal */
	private BigDecimal salaireBrut;
	@Column(precision = 6, scale = 2)
	/** netImposable : BigDecimal */
	private BigDecimal netImposable;
	@Column(precision = 6, scale = 2)
	/** netAPayer : BigDecimal */
	private BigDecimal netAPayer;

	/**
	 * Constructor
	 * 
	 */
	public CalculSalaireDTO() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param salaireBrut
	 * @param netImposable
	 * @param netAPayer
	 */
	public CalculSalaireDTO(BigDecimal salaireBrut, BigDecimal netImposable, BigDecimal netAPayer) {
		super();
		this.salaireBrut = salaireBrut;
		this.netImposable = netImposable;
		this.netAPayer = netAPayer;
	}

	/**
	 * Getter
	 * 
	 * @return the salaireBrut
	 */
	public BigDecimal getSalaireBrut() {
		return salaireBrut;
	}

	/**
	 * Setter
	 * 
	 * @param salaireBrut
	 *            the salaireBrut to set
	 */
	public void setSalaireBrut(BigDecimal salaireBrut) {
		this.salaireBrut = salaireBrut;
	}

	/**
	 * Getter
	 * 
	 * @return the netImposable
	 */
	public BigDecimal getNetImposable() {
		return netImposable;
	}

	/**
	 * Setter
	 * 
	 * @param netImposable
	 *            the netImposable to set
	 */
	public void setNetImposable(BigDecimal netImposable) {
		this.netImposable = netImposable;
	}

	/**
	 * Getter
	 * 
	 * @return the netAPayer
	 */
	public BigDecimal getNetAPayer() {
		return netAPayer;
	}

	/**
	 * Setter
	 * 
	 * @param netAPayer
	 *            the netAPayer to set
	 */
	public void setNetAPayer(BigDecimal netAPayer) {
		this.netAPayer = netAPayer;
	}

}
