package com.ejercicios.validar;

import java.util.Scanner;

public class ValidarNumero {
	/*
	 * Pide un numero por consola y valida que este entre 0 y 10.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		do {
			System.out.println("escribe un numero entre 0 y 10");
			numero = sc.nextInt();

			if (!(numero >= 0 && numero <= 10)) {
				System.out.println("Hay q escribir un numero entre 0 y 10");
			}
		} while (!(numero >= 0 && numero <= 10));

		System.out.println("El numero " + numero + " esta entre 0 y 10");

	}

}
