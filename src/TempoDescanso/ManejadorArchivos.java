package TempoDescanso;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author andres
 */
public class ManejadorArchivos {

    
    public static String[] leerArchivo(String nombreCompletoArchivo){
            
		FileReader fr;
		ArrayList<String> listaLineasArchivo = new ArrayList<String>();
		try {
                   
			fr = new FileReader(nombreCompletoArchivo);
			BufferedReader br = new BufferedReader(fr);
			String lineaActual = br.readLine();
			while (lineaActual != null){
                            
				listaLineasArchivo.add(lineaActual);
				lineaActual = br.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error al leer el archivo "+nombreCompletoArchivo);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error al leer el archivo "+nombreCompletoArchivo);
			e.printStackTrace();
		}
		

		return listaLineasArchivo.toArray (new String [0]);
	}
    
}
