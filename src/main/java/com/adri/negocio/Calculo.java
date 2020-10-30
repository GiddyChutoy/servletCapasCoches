/**
 * 
 */
package com.adri.negocio;

import java.io.IOException;

import com.adri.datos.Datos;

/**
 * @author Giddy
 *
 */
public class Calculo {
	
	public int calculoCoches(String nombre) throws IOException {
		Datos datos = new Datos();
		int contador = 0;
		
		for (String propietario : datos.consultaLista()) {
			if(propietario.equalsIgnoreCase(nombre)) {
				contador++;
			}
		}
		
		return contador;
	}
}
