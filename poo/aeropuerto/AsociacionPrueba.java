package com.ejercicios.poo.aeropuerto;

public class AsociacionPrueba {

	public static void main(String[] args) {
		Direccion d = new Direccion("Spain", "mentiras", 1, "Ciudad Real");

		Aeropuerto a = new Aeropuerto("Quijote Airport", d, 2000, 1000);

		Avion av = new Avion("Boeing 347", 200, 400);

		Avion av2 = new Avion("Tupolev 200", 400, 250);

		a.aniadirAvion(av);

		a.aniadirAvion(av2);

		System.out.println(a.getNum_aviones());

		System.out.println(a);

	}

}
