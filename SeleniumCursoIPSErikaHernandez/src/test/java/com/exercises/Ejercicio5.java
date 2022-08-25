package com.exercises;

public class Ejercicio5 {

	public static void main(String[] args) {

		Motocicleta moto1 = new Motocicleta();
		Motocicleta moto2 = new Motocicleta("rojo", "Harley-Davidson", "2022", "Chopper", false);
		Motocicleta moto3 = new Motocicleta("amarillo", "Italika", "2020", "Urbana", true);

		moto1.color = "rosa";
		moto1.marca = "Piaggio";
		moto1.modelo = "2016";
		moto1.tipo = "Vespa";
		moto1.portaEquipaje = true;

		moto1.encender();
		moto2.encender();
		moto3.encender();

		moto1.acelerar(20);
		moto2.acelerar(60);
		moto3.acelerar(40);

		moto1.frenar(20);
		moto2.frenar(30);
		moto3.frenar(20);
		moto2.frenar(30);
		moto3.frenar(20);

		moto1.apagar();
		moto2.apagar();
		moto3.apagar();

	}

}
