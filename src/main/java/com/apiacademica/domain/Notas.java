package com.apiacademica.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IDnotas;
	private String RA;
	private String nota1;
	private String nota2;
	private String notafinal;
	public long getIDnotas() {
		return IDnotas;
	}
	public void setIDnotas(long iDnotas) {
		IDnotas = iDnotas;
	}
	public String getRA() {
		return RA;
	}
	public void setRA(String rA) {
		RA = rA;
	}
	public String getNota1() {
		return nota1;
	}
	public void setNota1(String nota1) {
		this.nota1 = nota1;
	}
	public String getNota2() {
		return nota2;
	}
	public void setNota2(String nota2) {
		this.nota2 = nota2;
	}
	public String getNotafinal() {
		return notafinal;
	}
	public void setNotafinal(String notafinal) {
		this.notafinal = notafinal;
	}

}
