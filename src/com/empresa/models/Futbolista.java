package com.empresa.models;

//Clase hija de SeleccionFutbol
public class Futbolista extends SeleccionFutbol {

	private int dorsal;
	private String demarcacion;

	public Futbolista() {
		super();
	}

	public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
		// imvocamos al constructor de la clase padre con "super"
		super(id, nombre, apellido, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	public void jugarPartido() {
		System.out.println("Clase futbolista - jugarPartido");
	}

	public void entrenar() {
		System.out.println("Clase futbolista - entrenar");
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	@Override
	public String toString() {
		return "Futbolista [dorsal=" + dorsal + ", demarcacion=" + demarcacion + ", toString()=" + super.toString()
				+ "]";
	}

}

	
