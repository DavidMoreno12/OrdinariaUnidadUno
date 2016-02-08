package com.untg.asociacionDos;

import java.util.List;

public class Cliente {
	//se definen atributos de la
 	private int mesa; 
 	private int comensales; 
 	 
 	//relaciones muchos con orden 
 	private List<Orden> orden; 
 
 
 	//constructor y relacion de muchos 
 	public Cliente(List<Orden> ordens) { 
 	} 


}
