package com.exercises;

public class Motocicleta {

	int llantas;
	String color;
	String marca;
	String modelo;
	String tipo;
	boolean portaEquipaje;
	double kmsPorHora;

	public Motocicleta(String pColor, String pMarca, String pModelo, String pTipo, boolean pPortaEquipaje) {
		this.llantas = 2;
		this.color = pColor;
		this.marca = pMarca;
		this.modelo = pModelo;
		this.tipo = pTipo;
		this.portaEquipaje = pPortaEquipaje;
		this.kmsPorHora = 0;
	}

	public Motocicleta() {
		this.llantas = 2;
		this.kmsPorHora = 0;
	}

	public void encender() {
		System.out.println("La moto " + this.tipo + " está encendida.");
	}

	public void acelerar(double kms) {
		this.kmsPorHora += kms;
		System.out.println("La velocidad de la moto " + this.tipo + " es " + this.kmsPorHora + " km/h.");
	}

	public void frenar(double kms) {
		this.kmsPorHora -= kms;
		System.out.println("La velocidad de la moto " + this.tipo + " es " + this.kmsPorHora + " km/h.");
	}

	public void apagar() {
		System.out.println("La moto " + this.tipo + " está apagada.");
	}

}
