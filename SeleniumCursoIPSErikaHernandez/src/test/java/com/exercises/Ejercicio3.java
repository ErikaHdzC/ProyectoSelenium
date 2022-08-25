package com.exercises;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Arreglos:

		/*
		 * Unidimensional Bidimensional Multidimensional
		 */

		/*
		 * String[] diasSemana = { "L", "M", "Mi", "J", "V", "S", "D" };
		 * System.out.println("El dia de hoy es " + diasSemana[3]);
		 * 
		 * String[] diasSemana2 = new String[7];
		 * 
		 * diasSemana2[0] = "L"; diasSemana2[1] = "M";
		 * 
		 * int[] numeros = new int[1]; numeros[0] = 23;
		 * 
		 * String[][] nombres = new String[4][4]; nombres[0][0] = "Ricardo";
		 * nombres[0][1] = "Ricardo"; nombres[1][0] = "Ricardo"; nombres[1][1] =
		 * "Ricardo"; nombres[2][0] = "Ricardo"; nombres[2][1] = "Ricardo";
		 */
		// Ejercicio #3 - Crear un arreglo unidimensional (como objeto) de 4 posiciones:

//				1- First Name
//				2- Middle Name
//				3- Last Name
//				4- Edad

//				**Imprimir el arreglo concatenando sus valores

		Object[] x = new Object[] { "Erika", "Patricia", "Hernandez", 35 };
		System.out.println("Valores del array: " + x[0] + " " + x[1] + " " + x[2] + " " + x[3]);
	}

}
