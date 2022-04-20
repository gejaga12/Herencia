package com.empresa.models;

//Clase hija de SeleccionFutbol
public class Entrenador extends SeleccionFutbol {

	private String idFederacion;

	public Entrenador() {
		super();
	}

	public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
		// imvocamos al constructor de la clase padre con "super"
		super(id, nombre, apellido, edad);
		this.edad = edad;
		this.idFederacion = idFederacion;
	}

	public void dirigirPartido() {
		System.out.println("Clase Entrenador - dirigirPartido");
	}

	public void dirigirEntrenamiento() {
		System.out.println("Clase Entrenador - dirigirEntrenamiento");
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

	@Override
	public String toString() {
		return "Entrenador [idFederacion=" + idFederacion + ", toString()=" + super.toString() + "]";
	}

}
