package com.demo.dto;

import java.io.Serializable;

import com.googlecode.jmapper.annotations.JMap;

public class ClienteDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4703097417907070084L;

	@JMap("codCli")
	private Integer codCli;

	@JMap("dniCli")
	private String dniCli;

	@JMap("nomCli")
	private String nomCli;

	@JMap("apePatCli")
	private String apePatCli;

	@JMap("apeMatCli")
	private String apeMatCli;

	@JMap("edadCli")
	private int edadCli;

	@JMap("direccCli")
	private String direccCli;

	// --------------------------------------


	public Integer getCodCli() {
		return codCli;
	}

	public void setCodCli(Integer codCli) {
		this.codCli = codCli;
	}

	public String getDniCli() {
		return dniCli;
	}

	public void setDniCli(String dniCli) {
		this.dniCli = dniCli;
	}

	public String getNomCli() {
		return nomCli;
	}

	public void setNomCli(String nomCli) {
		this.nomCli = nomCli;
	}

	public String getApePatCli() {
		return apePatCli;
	}

	public void setApePatCli(String apePatCli) {
		this.apePatCli = apePatCli;
	}

	public String getApeMatCli() {
		return apeMatCli;
	}

	public void setApeMatCli(String apeMatCli) {
		this.apeMatCli = apeMatCli;
	}

	public int getEdadCli() {
		return edadCli;
	}

	public void setEdadCli(int edadCli) {
		this.edadCli = edadCli;
	}

	public String getDireccCli() {
		return direccCli;
	}

	public void setDireccCli(String direccCli) {
		this.direccCli = direccCli;
	}
	
}
