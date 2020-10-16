package com.test.backjava.models;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_subestacao")
public class Subestacao implements Serializable {

	private static final long serialVersionUID = 1L; 
	
	@Id
	private Long id_subestacao;
	
	private String codigo;
	
	private String nome;

	private BigDecimal latitude;
	
	private BigDecimal longitude;
	
	public long getId_subestacao() {
		return id_subestacao;
	}
	
	public void setId_subestacao(long id_subestacao) {
		this.id_subestacao = id_subestacao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
}
