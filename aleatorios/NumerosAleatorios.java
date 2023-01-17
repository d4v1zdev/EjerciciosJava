package com.ejercicios.aleatorios;

public class NumerosAleatorios {
	/*
	 * Genera diez numeros aleatorios entre 1 y 10
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int alea = (int) Math.floor(Math.random() * (10 - 1) + 1);
			System.out.print(alea + " ");

		}
	}

}
