package com.ejercicios.concatena;

import java.util.Scanner;

public class ConcatenaPalabras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame una cadena");
		String cadena = sc.next();
		String concatenar = "";
		while (!cadena.equals("")) {
			concatenar += cadena;
			System.out.println("Dame una cadena");
			cadena = sc.next();
		}
		System.out.println(concatenar);
	}

}
