package com.ejercicios.recorrerCadena;

import java.util.Scanner;

public class RecorreCadena {
	/*
	 * Pide una cadena por consola y muestra sus caracteres uno a uno
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cadena");
		String cadena = sc.next();
		char caracter;
		for (int i = 0; i < cadena.length(); i++) {
			caracter = cadena.charAt(i);
			System.out.println(caracter);
		}
	}

}
