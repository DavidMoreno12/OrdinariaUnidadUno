package com.utng.asociacionUno;

import java.util.Date;
import java.util.List;

public class ProveedorCalificado {
   //se crean atributos de la clase
 	private Date FechaCalificacion; 
 	private int cal_ID; 
 	private int pr_ID; 
 	//se genera la asociación de agregación con calificaciones
 	private List<Calificacion> caificacions; 
 	private Calificacion calificacion; 
 
	 
 	//constructor de la clase y definición de la relaciones
 	public ProveedorCalificado(List<Calificacion> caificacions,Calificacion caificacion) { 
 		this.calificacion = calificacion; 
 		
 	} 


}
