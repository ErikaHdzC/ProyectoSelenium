package com.exercises;

public class Ejercicio4 {

	public static void main(String[] args) {
		multiplicacion(2, 3, 100);

	}

	// Metodo
	public static void multiplicacion(int x, int y, int z) {
		int resultado = x * y * z;
		System.out.println("El resultado de multiplicar " + x + " * " + y + " * " + z + " es= " + resultado);
	}

}
