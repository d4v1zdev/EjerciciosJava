package com.ejercicios.arrays.rellenaraleatorios;

public class RellenarArrayAleatorio {
	/*
	 * Crea un array de 10 posiciones y rellenalo con numeros aleatorios. Muestralos
	 * al final. Crea una funcion para rellenarlo y otra para mostrar
	 */
	public static void main(String[] args) {
		int[] numerosAleatorios = new int[10];

		int minimo = 5;
		int maximo = 10;

		rellenarArrayAleatorios(numerosAleatorios, minimo, maximo);
		mostrarArray(numerosAleatorios);
	}

	public static int generaNumeroAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}

	public static void rellenarArrayAleatorios(int[] array, int min, int max) {
		for (int i = 0; i < array.length; i++) {
			array[i] = generaNumeroAleatorio(min, max);
		}
	}

	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
