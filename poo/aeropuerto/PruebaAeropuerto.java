package com.ejercicios.poo.aeropuerto;

public class PruebaAeropuerto {

	public static void main(String[] args) {
		Aeropuerto a = new Aeropuerto("Adolfo SUarez", "Spain", "calle", 1, "Madrid", 1970, 250000);

		System.out.println(a);

		System.out.println(a.aniosAbierto());

		Direccion d = new Direccion("Spain", "mentiras", 1, "Ciudad Real");

		Aeropuerto a2 = new Aeropuerto("Quijote Airport", d, 2000, 1000);

		System.out.println(a2);

		System.out.println(a2.aniosAbierto());

	}

}
