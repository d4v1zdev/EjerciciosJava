package com.ejercicios.iva;

import java.util.Locale;
import java.util.Scanner;

public class PrecioIva {
	/*
	 * Pide un numero real que represente a un precio y muestra el precio con iva.
	 * El Iva es del 21%
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Introduce un numero");
		double precio = sc.nextDouble();
		sc.close();
		double total = precio * 1.21;
		System.out.println("El precio iva incluido es " + total);

	}

}
