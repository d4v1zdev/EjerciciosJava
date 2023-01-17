package com.ejercicios.bisiesto;

import java.util.Scanner;

public class Bisiesto {
	/*
	 * Pide un ano por teclado e indica si es bisiesto o no. Es bisiesto cueando es
	 * divisible entre 4 y no divisible entre 100 o si es divisible entre 400
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un ano en numero");
		int anio = sc.nextInt();
		if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
			System.out.println("Es bisiesto");
		} else {
			System.out.println("No es bisiesto");
		}

	}

}
