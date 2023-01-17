package com.ejercicios.saludo;

import java.util.Scanner;

public class Saludar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un nombre");
		String nombre = sc.nextLine();
		System.out.println("El nombre de pila es " + nombre + " y apellido");

	}

}
