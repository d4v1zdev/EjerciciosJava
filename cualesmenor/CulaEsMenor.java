package com.ejercicios.cualesmenor;

import java.util.Scanner;

public class CulaEsMenor {
	/*
	 * Pide 2 numeros por consola e indica cual es menor de los 2 numeros. En caso
	 * de ser iguales, tambien lo debes indicar
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero 1");
		int num1 = sc.nextInt();
		System.out.println("Introduce el numero 2");
		int num2 = sc.nextInt();

		if (num1 == num2) {
			System.out.println("Los 2 numeros Son iguales");
		} else if (num1 > num2) {
			System.out.println("El numero 1 es mayor que el numero 2");

		} else {
			System.out.println("El numero 2 es mayor que el numero 1");
		}

	}

}
