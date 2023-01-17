package com.ejercicios.aleatoriosfuncion;

public class FuncionGeneraAleatorios {
	/*
	 * Crea una funcion que genere un numero aleatorio entre 2 numeros pasados por
	 * parametro
	 */
	public static void main(String[] args) {
		// generaNumeroAleatorio(1, 10);
		System.out.println(generaNumeroAleatorio(1, 10));
	}

	public static int generaNumeroAleatorio(int min, int max) {
		int aleat = (int) Math.floor(Math.random() * (max - min + 1) + min);
		return aleat;
	}

}
