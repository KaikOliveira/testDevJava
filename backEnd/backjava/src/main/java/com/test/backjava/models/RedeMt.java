package com.test.backjava.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_rede_mt")
public class RedeMt {

	
	@Id
	private Long id_rede_mt;
	
	private String codigo;
	
	private String nome;
	
	private BigDecimal tensao_nominal;
	
	
	public long getId_rede_mt() {
		return id_rede_mt;
	}
	
	public void setId_rede_mt(long id_rede_mt) {
		this.id_rede_mt = id_rede_mt;
	}

	public String getCodigoRede() {
		return codigo;
	}

	public void setCodigoRede(String codigo) {
		this.codigo = codigo;
	}

	public String getNomeRede() {
		return nome;
	}

	public void setNomeRede(String nome) {
		this.nome = nome;
	}

	public BigDecimal getTensao_nominal() {
		return tensao_nominal;
	}

	public void setTensao_nominal(BigDecimal tensao_nominal) {
		this.tensao_nominal = tensao_nominal;
	}
}
