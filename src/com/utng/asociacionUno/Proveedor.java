package com.utng.asociacionUno;

import java.util.List;

public class Proveedor {
	//se crean atributos de la clase
 	private double pr_ID; 
 	private String pr_RazonSocial; 
 	private String pr_contacto; 
 	private String pr_telefono1; 
 	private short pr_telefono2; 
 	private String pr_fax; 
 	private String pr_email1; 
 	private String pr_email2; 
 	private String pr_web; 
 	private int pr_CUIT; 
 	 
 	//se genera la asociación de agregación con rubro y direcciones
 	private List<Rubro>rubros; 
 	private List<Direccion> direccions; 
 
	 
 	 
 	// constructor de la clase, se define relacion de agregacion con las clases rubro y direccion, 
 	// y relación con calificación y articulo 
 	  
 	public Proveedor(List<Rubro>rubros,List<Direccion> direccions,Calificacion caificacion, Articulo articulo) { 
 		this.rubros = rubros; 
 		this.direccions = direccions; 
 	} 


}
