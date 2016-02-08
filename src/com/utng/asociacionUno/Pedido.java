package com.utng.asociacionUno;

import java.util.Date;
import java.util.List;

public class Pedido {
	//se declaran atributos de la clase
 	private double pe_id; 
 	private Date pe_fechapedido; 
 	private Date pe_fechanecesidad; 
 	private Date pe_fechaprogramada; 
 	private Date pe_fechaentrega; 
 	private int pe_estado; 
 	 
 	//Se genera la  relaci�n de agregaci�n con articulos
 	private List<Articulo> articulos; 
 	 
     //COnstructor de la clase, y se especifica la relaci�n de agregaci�n
 	public Pedido(List<Articulo> articulos) { 
 		this.articulos = articulos; 
 	} 


}
