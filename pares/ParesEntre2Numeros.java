package com.ejercicios.pares;

import java.util.Scanner;

public class ParesEntre2Numeros {
	/*
	 * Numeros pares entre 2 numeros
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		int num1 = sc.nextInt();
		System.out.println("Introduce el segundo numero");
		int num2 = sc.nextInt();
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " "); // Muestra hacia la derecha
			}
		}
	}

}
