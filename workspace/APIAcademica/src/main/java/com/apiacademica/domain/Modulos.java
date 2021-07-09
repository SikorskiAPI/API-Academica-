package com.apiacademica.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Modulos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IDmodulos;
	public long getIDmodulos() {
		return IDmodulos;
	}
	public void setIDmodulos(long iDmodulos) {
		IDmodulos = iDmodulos;
	}
	public String getRA() {
		return RA;
	}
	public void setRA(String rA) {
		RA = rA;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String getData_inicio() {
		return data_inicio;
	}
	public void setData_inicio(String data_inicio) {
		this.data_inicio = data_inicio;
	}
	public String getData_fim() {
		return data_fim;
	}
	public void setData_fim(String data_fim) {
		this.data_fim = data_fim;
	}
	private String RA;
	private String disciplina;
	private String data_inicio;
	private String data_fim;
}
