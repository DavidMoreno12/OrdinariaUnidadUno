package com.untg.asociacionDos;

import java.util.List;

public class Orden {
	//atributos de la clase
 	private int hora; 
 	private String mesero; 
 	//relación con cliente y pago
 	private Cliente cliente; 
 	private Pago pago; 
 	//asociación de con bebidas y platillos 
 	private List<Bebida> bebidas; 
 	private List<Platillo>platillos; 
 	
    //constructor de la clase, se define la asociaicón de agregacion de las clase bebida y platillo  
 	public Orden(List<Bebida> bebidas, List<Platillo>platillos) { 
 		this.bebidas = bebidas; 
 		this.platillos = platillos; 
 	} 


}
