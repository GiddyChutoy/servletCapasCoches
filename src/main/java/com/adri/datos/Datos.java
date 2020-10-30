/**
 * 
 */
package com.adri.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Giddy
 *
 */
public class Datos {
	
	public List<String> consultaLista() throws IOException {
		
		List<String> listaNombres = new ArrayList<>();
		
		File fichero = new File("C:\\Users\\201907\\eclipse-workspace\\Coches\\Coches.txt");
		BufferedReader br = new BufferedReader(new FileReader(fichero));
		String linea;
		
		while((linea = br.readLine()) != null) {
			String[] array = linea.split("-");
			listaNombres.add(array[0]);
		}
		return listaNombres;
	}
	
}
