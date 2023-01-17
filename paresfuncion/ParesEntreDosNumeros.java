package com.ejercicios.paresfuncion;

public class ParesEntreDosNumeros {
	/*
	 * Crea un metodo que pasados 2 numeros, muestre los pares entre esos 2 numeros
	 */
	public static void main(String[] args) {
		paresDosNumeros(38, 140);

	}

	public static void paresDosNumeros(int num1, int num2) {
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
