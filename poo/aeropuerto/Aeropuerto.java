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
 */
public class Aeropuerto {
	// Atributos
	private String nombre;
	private Direccion direccion;
	private int anio;
	private int capacidad;

	// Constructor vacio
	public Aeropuerto() {
		super();
	}

	// Constructor con parametros

	public Aeropuerto(String nombre, String pais, String calle, int numero, String ciudad, int anio, int capacidad) {
		super();
		this.nombre = nombre;
		this.direccion = new Direccion(pais, calle, numero, ciudad);
		this.anio = anio;
		this.capacidad = capacidad;
	}

	public Aeropuerto(String nombre, Direccion direccion, int anio, int capacidad) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.anio = anio;
		this.capacidad = capacidad;
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

	// toString
	@Override
	public String toString() {
		return "Aeropuerto [nombre=" + nombre + ", direccion=" + direccion + ", anio=" + anio + ", capacidad="
				+ capacidad + "]";
	}

}
