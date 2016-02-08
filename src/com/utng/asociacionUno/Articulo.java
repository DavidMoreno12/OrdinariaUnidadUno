package com.utng.asociacionUno;

import java.util.List;

public class Articulo {
	//se declara atributos de la clase
 	private String art_ID; 
 	private String art_Descripcion; 
 	private int art_estado; 
 	private int art_tipo; 
 	private int art_cantidad; 
 	private double art_cantidadcritica; 
 	private double art_cantidaddoble; 
 	 
 	//Se genera la realción de Agregacion con rubro 
 	  private List<Rubro>rubros; 
 	 	 
 	//constructor de la clase, se pasa la relación de agregación 
 	//y como parametro la relación con precios  
 	public Articulo(List<Rubro>rubros,Precio precios) { 
 		this.rubros = rubros; 
 	} 


}
