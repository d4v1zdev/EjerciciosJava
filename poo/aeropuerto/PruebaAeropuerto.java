package com.ejercicios.poo.aeropuerto;

public class PruebaAeropuerto {

	public static void main(String[] args) {
		Aeropuerto a = new Aeropuerto("Adolfo SUarez", "Spain", "calle", 1, "Madrid", 1970, 250000);

		System.out.println(a);

		System.out.println(a.aniosAbierto());

	}

}
