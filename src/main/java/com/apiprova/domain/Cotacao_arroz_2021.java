package com.apiprova.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cotacao_arroz_2021 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String mes;
	private String dia;
	private String preco_atual;
	private String preco_dollar;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getPreco_atual() {
		return preco_atual;
	}
	public void setPreco_atual(String preco_atual) {
		this.preco_atual = preco_atual;
	}
	public String getPreco_dollar() {
		return preco_dollar;
	}
	public void setPreco_dollar(String preco_dollar) {
		this.preco_dollar = preco_dollar;
	}

}
