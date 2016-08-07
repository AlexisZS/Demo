package com.demo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "VENTA")
public class Venta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6883468410055398770L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_VEN")
	private Integer cod_ven; // Auto Incremental

	@Column(name = "NUM_FACT")
	private String num_fact;

	@Column(name = "FECH_VEN")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fech_ven; // TIMESTAMP,

	@Column(name = "COD_CLI")
	private Integer cod_cli;

	// ---------------------------------------------------

	public Integer getCod_ven() {
		return cod_ven;
	}

	public void setCod_ven(Integer cod_ven) {
		this.cod_ven = cod_ven;
	}

	public String getNum_fact() {
		return num_fact;
	}

	public void setNum_fact(String num_fact) {
		this.num_fact = num_fact;
	}

	public Date getFech_ven() {
		return fech_ven;
	}

	public void setFech_ven(Date fech_ven) {
		this.fech_ven = fech_ven;
	}

	public Integer getCod_cli() {
		return cod_cli;
	}
	
	public void setCod_cli(Integer cod_cli) {
		this.cod_cli = cod_cli;
	}

}
