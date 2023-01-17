package com.ejercicios.multiplicar;

import java.util.Scanner;

public class Tabla10 {
	/*
	 * Pedir un numero por consola y mostrar la tabla del 10
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero por el que multiplicar");
		int num = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.println(i * num);

		}

	}

}
