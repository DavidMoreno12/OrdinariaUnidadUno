package com.utng.ayc;

import java.util.ArrayList;
import java.util.List;

public class Persona {

 	public String nombre; 
 	//Asociasici�n con coche
 	private Coche coche; 
 	
 	//Asociaici�n de composicion con corazon  
 	private List<Corazon> corazons; 
 	 
 	// Se genera la composicion con la clase coraz�n
 	public Persona(String nom) { 
 		this.corazons = new ArrayList<Corazon>(); 
 	} 
 	//M�todo de asignaci�n de coche, recibe un parametro de tipo coche
 	public void asignaCoche(Coche c){ 
 		 
 	} 

	}
