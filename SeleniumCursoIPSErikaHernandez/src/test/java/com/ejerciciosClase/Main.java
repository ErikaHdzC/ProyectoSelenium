package com.ejerciciosClase;

public class Main {

	public static void main(String[] args) {

		imprimirRango(1, 20);

		Perro perrito1 = new Perro("Labrador", "mediano", "macho");
		Perro perrito2 = new Perro();
		perrito2.setRaza("Chihuahua");
		perrito2.setTamano("chico");
		perrito2.setSexo("hembra");

		System.out.println(
				"El perrito 1 es: " + perrito1.getRaza() + " , " + perrito1.getTamano() + " , " + perrito1.getSexo());
		System.out.println(
				"El perrito 2 es: " + perrito2.getRaza() + " , " + perrito2.getTamano() + " , " + perrito2.getSexo());

	}

	public static void imprimirRango(int min, int max) {
		for (int i = min; i <= max; i++)
			System.out.println("El número es: " + i);
	}

}
