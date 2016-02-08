package com.utng.asociacionUno;

public class Precio {
	//Atributos de la Clase
 	private double pre_id; 
 	private double art_ID; 
 	private double pr_ID; 
 	private float pr_pesos; 
 	private int pr_dolar; 
 	private float cotizaciondolar; 
 	//se crea la relación de dependencia
 	private Proveedor proveedor;
 
	//Constructor de la clase, se define la relación de dependencia
 	public Precio(Proveedor proveedor) { 
 		this.proveedor = proveedor;
 	} 
 
	 


}
