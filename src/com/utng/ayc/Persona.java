package com.utng.ayc;

import java.util.ArrayList;
import java.util.List;

public class Persona {

 	public String nombre; 
 	//Asociasición con coche
 	private Coche coche; 
 	
 	//Asociaición de composicion con corazon  
 	private List<Corazon> corazons; 
 	 
 	// Se genera la composicion con la clase corazón
 	public Persona(String nom) { 
 		this.corazons = new ArrayList<Corazon>(); 
 	} 
 	//Método de asignación de coche, recibe un parametro de tipo coche
 	public void asignaCoche(Coche c){ 
 		 
 	} 

	}
