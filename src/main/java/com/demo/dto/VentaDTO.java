package com.demo.dto;

import java.io.Serializable;
import java.util.Date;



import com.googlecode.jmapper.annotations.JMap;

public class VentaDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7516851810595759244L;

	@JMap( "cod_ven")
	private Integer cod_ven;

	@JMap("num_fact")
	private String num_fact;

	@JMap("fech_ven")
	private Date fech_ven;

	@JMap("cod_cli")
	private Integer cod_cli;
	
	//----------------------------------------

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
