package TempoDescanso;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author andres
 */
public class ManejadorDate {
    
    
    public static Date deStringToDate(String fecha) {        
        try {
            DateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date fechaEnviar = formatoDelTexto.parse(fecha);
            
            return fechaEnviar;
        } catch (ParseException ex) {
            ex.printStackTrace();
            return null;
        }
    }  
    public static String deDateToString(Date fecha) {        
         DateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         String fechaEnviar = formatoDelTexto.format(fecha);
         return fechaEnviar;
    }
    
}
