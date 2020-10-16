package com.test.testjava.models;

import java.io.Serializable;
import java.math.BigDecimal;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;


@Entity

public class Subestacao implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private long ID_SUBESTACAO;
	
	private String CODIGO;
	
	private String NOME;
	
	private BigDecimal LATITUDE;
	
	private BigDecimal LONGITUDE;

	public String getCODIGO() {
		return CODIGO;
	}

	public void setCODIGO(String cODIGO) {
		CODIGO = cODIGO;
	}

	public String getNOME() {
		return NOME;
	}

	public void setNOME(String nOME) {
		NOME = nOME;
	}

	public BigDecimal getLATITUDE() {
		return LATITUDE;
	}

	public void setLATITUDE(BigDecimal lATITUDE) {
		LATITUDE = lATITUDE;
	}

	public BigDecimal getLONGITUDE() {
		return LONGITUDE;
	}

	public void setLONGITUDE(BigDecimal lONGITUDE) {
		LONGITUDE = lONGITUDE;
	}
	
	
}
