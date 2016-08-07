package com.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
// @NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 44935259940229023L;

	@Id
	@Column(name = "COD_CLI")
	private Integer codCli;

	@Column(name = "DNI_CLI")
	private String dniCli;

	@Column(name = "NOM_CLI")
	private String nomCli;

	@Column(name = "APEPAT_CLI")
	private String apePatCli;

	@Column(name = "APEMAT_CLI")
	private String apeMatCli;

	@Column(name = "EDAD_CLI")
	private int edadCli;

	@Column(name = "DIRECC_CLI")
	private String direccCli;

	

	// ---------------------------------------

	
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
