package com.ejercicios.poo.aeropuerto;

/*
 * Crea una clase avion con los siguientes atributos:
 * - modelo
 * - numero asientos
 * - velocidad maxima
 */
public class Avion {
	// Atributos
	private String modelo;
	private int numAsientos;
	private double velMaxima;

	/**
	 * Constructores uno vacio y otro con parametros
	 */
	public Avion() {
		super();
	}

	public Avion(String modelo, int numAsientos, double velMaxima) {
		super();
		this.modelo = modelo;
		this.numAsientos = numAsientos;
		this.velMaxima = velMaxima;
	}

	// Getters & Setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	public double getVelMaxima() {
		return velMaxima;
	}

	public void setVelMaxima(double velMaxima) {
		this.velMaxima = velMaxima;
	}

	@Override
	public String toString() {
		return "Avion [modelo=" + modelo + ", numAsientos=" + numAsientos + ", velMaxima=" + velMaxima + "]";
	}

}
