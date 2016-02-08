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
 	 
 	//Se genera la  relación de agregación con articulos
 	private List<Articulo> articulos; 
 	 
     //COnstructor de la clase, y se especifica la relación de agregación
 	public Pedido(List<Articulo> articulos) { 
 		this.articulos = articulos; 
 	} 


}
