package com.utng.ayc;

import java.util.List;

public class Coche {

	// Se genera la Asociación con persona 
	private Persona conductor; 
	//Se genera la asociación con motor 
	private List<Motor> motors; 
	 
	//constructor de la clase, se genera la asociación de agregación de la clase motor 
	 	 
	 	public Coche(List<Motor>motors) { 
	 		this.motors = motors; 
	 	} 

	//se declaran los métodos de la clase
	public void AsignarConductor(){}
	public void encender(){}
	public void apagar(){}
	public void acelerar(){}
	public void frenar(){}
	public boolean estaEncendido(){
	return false;
	}
}
