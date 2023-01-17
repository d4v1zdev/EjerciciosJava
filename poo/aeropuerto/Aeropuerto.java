package com.ejercicios.poo.aeropuerto;

import java.util.Calendar;

/*
 * Crea una clase aeropuerto con los siguientes atributos:
 * - Nombre
 * - Pais
 * - Calle
 * - Numero
 * - Ciudad
 * - Anio inaguracion
 * - Capacidad
 * 
 * aniosAbierto() --> devuelve el numero de anios abierto
 * 
 * Segund0 --> Asocia el aeropuerto con el avion mediante una asociacion
 * Un aeropuerto tiene uno o varios aviones
 * Add la funcion --> aniadirAvion(Avion a)
 */
public class Aeropuerto {

	private final int MAX_AVIONES = 20;
	// Atributos
	private String nombre;
	private Direccion direccion;
	private int anio;
	private int capacidad;
	private Avion[] aviones;
	private int numAviones;

	// Constructor vacio
	public Aeropuerto() {
		super();
		this.aviones = new Avion[MAX_AVIONES];
		this.numAviones = 0;
	}

	// Constructor con parametros

	public Aeropuerto(String nombre, String pais, String calle, int numero, String ciudad, int anio, int capacidad) {
		super();
		this.nombre = nombre;
		this.direccion = new Direccion(pais, calle, numero, ciudad);
		this.anio = anio;
		this.capacidad = capacidad;
		this.aviones = new Avion[MAX_AVIONES];
		this.numAviones = 0;
	}

	public Aeropuerto(String nombre, Direccion direccion, int anio, int capacidad) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.anio = anio;
		this.capacidad = capacidad;
		this.aviones = new Avion[MAX_AVIONES];
		this.numAviones = 0;
	}

	// Getters & Setters

	public int aniosAbierto() {
		int anioActual = Calendar.getInstance().get(Calendar.YEAR);
		return anioActual - this.getAnio();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getNum_aviones() {
		return numAviones;
	}

	public void aniadirAvion(Avion a) {
		if (numAviones < MAX_AVIONES) {
			this.aviones[numAviones] = a;
			numAviones++;
		} else {
			System.out.println("no puedes meter mas aviones");
		}
	}

	private String mostrarAviones() {
		String avionesCadena = "";
		for (int i = 0; i < numAviones; i++) {
			avionesCadena += this.aviones[i].toString() + "\n";
		}
		return avionesCadena;
	}

	// toString
	@Override
	public String toString() {
		return "Aeropuerto [nombre=" + nombre + ", direccion=" + direccion + " \n " + ", anio=" + anio + ", capacidad= "
				+ capacidad + " \n " + "Cuenta con los siguientes aviones: \n" + mostrarAviones();
	}

}
