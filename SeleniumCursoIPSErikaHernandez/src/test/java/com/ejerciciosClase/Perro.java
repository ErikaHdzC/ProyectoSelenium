package com.ejerciciosClase;

public class Perro {

	private String raza;
	private String tamano;
	private String sexo;

	Perro(String r, String t, String s) {
		this.raza = r;
		this.tamano = t;
		this.sexo = s;
	}

	Perro() {

	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
