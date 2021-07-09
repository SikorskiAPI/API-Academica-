package com.apiacademica.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Avaliacoes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDavaliacoes;
	private String RA;
	private String curso;
	private String disciplina;
	private String data;
	public Long getIDavaliacoes() {
		return IDavaliacoes;
	}
	public void setIDavaliacoes(Long iDavaliacoes) {
		IDavaliacoes = iDavaliacoes;
	}
	public String getRA() {
		return RA;
	}
	public void setRA(String rA) {
		RA = rA;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

}
