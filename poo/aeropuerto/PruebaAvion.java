package com.ejercicios.poo.aeropuerto;

public class PruebaAvion {

	public static void main(String[] args) {
		Avion a1 = new Avion();
		Avion a2 = new Avion("Boing 747", 150, 400);
		System.out.println(a1.getModelo());
		a1.setModelo("Modelo 1");
		a1.setNumAsientos(100);

		System.out.println(a1.getModelo());
		System.out.println(a2.toString());
	}

}
