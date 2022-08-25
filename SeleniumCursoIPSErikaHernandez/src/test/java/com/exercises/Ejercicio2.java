package com.exercises;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Ciclos

		// Estructuras de un ciclo en Java

		/*
		 * 1- While 2- Do while 3- For
		 */

		// Contador del 1 - 10

		/*
		 * int numero = 1;
		 * 
		 * while (numero <= 10) { System.out.println("Este es el numero:" + numero);
		 * numero++; // break;
		 * 
		 * }
		 * 
		 * // Cuantas veces se tiene que sumar un mismo numero para llegar a 100;
		 * 
		 * /* int numeroSum = 15; int sumTotal = 0; int count = 0;
		 * 
		 * do { // Block code sumTotal = sumTotal + numeroSum; count++; } while
		 * (sumTotal < 100);
		 * 
		 * System.out.println("El numero se sumo a si mismo: " + count + " veces");
		 * 
		 * // Contador del 1 - 10 (FOR)
		 * 
		 * numero = 10;
		 * 
		 * for (int i = 1; i <= numero; i++) { System.out.println("El numero FOR es: " +
		 * i); }
		 */

		// Ejercicio #2 - Contador de 10 - 1

		for (int i = 10; i >= 1; i--) {
			System.out.println("El número FOR es: " + i);
		}

	}

}
