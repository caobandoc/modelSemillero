package com.clearminds.caoc.dtos;

public class Estudiante {
	private String nombre;
	private String apellido;
	private int numero;
	public Estudiante(String nombre, String apellido, int numero) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numero = numero;
	}
	public Estudiante(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", numero=" + numero + "]";
	}
	
	
}
