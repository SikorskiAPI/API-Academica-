package com.apiacademica.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alunos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDalunos;
	
	private String RA;
	private String nome;
	private String cpf;
	private String endereco;
	
	
	public Long getIDalunos() {
		return IDalunos;
	}
	public void setIDalunos(Long iDalunos) {
		IDalunos = iDalunos;
	}
	public String getRA() {
		return RA;
	}
	public void setRA(String rA) {
		RA = rA;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
