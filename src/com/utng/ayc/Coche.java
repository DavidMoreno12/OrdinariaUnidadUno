package com.utng.ayc;

import java.util.List;

public class Coche {

	// Se genera la Asociaci�n con persona 
	private Persona conductor; 
	//Se genera la asociaci�n con motor 
	private List<Motor> motors; 
	 
	//constructor de la clase, se genera la asociaci�n de agregaci�n de la clase motor 
	 	 
	 	public Coche(List<Motor>motors) { 
	 		this.motors = motors; 
	 	} 

	//se declaran los m�todos de la clase
	public void AsignarConductor(){}
	public void encender(){}
	public void apagar(){}
	public void acelerar(){}
	public void frenar(){}
	public boolean estaEncendido(){
	return false;
	}
}
