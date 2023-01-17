package com.ejercicios.operaciones;

import java.util.Scanner;

public class OperacionesAritmeticas {
	/**
	 * Metodo main que pide 2 numeros por consola y muestra su suma, resta,
	 * multiplicacion y division
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero 1");
		int num1 = sc.nextInt();
		System.out.println("Introduce el numero 2");
		int num2 = sc.nextInt();

		System.out.println("La suma es : " + (num1 + num2));
		System.out.println("La resta es: " + (num1 - num2));

	}

}
