package TempoDescanso;




import com.sun.rowset.CachedRowSetImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.rowset.CachedRowSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andres
 */
public class Conexion {
    
   String[] datos;
   
   public Conexion(){
       datos = ManejadorArchivos.leerArchivo("./conexion.txt");
   }
    

    public CachedRowSet Function(String sql)
    {
        
            Connection con;
            try
            {
                                
                    String url = "jdbc:mysql://"+datos[0]+":"+datos[1]+"/"+datos[2];
                    con = DriverManager.getConnection(url, datos[3],datos[4]);
                    Statement s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                      ResultSet.CONCUR_READ_ONLY);
 
                    ResultSet rs= s.executeQuery(sql);
 
                    CachedRowSet crs = new CachedRowSetImpl();
                    
                    crs.populate(rs);
 
                    rs.close();
                    s.close();
                    con.close();
                    
 
                    return crs;
 
            }
            catch(Exception e)
            {
                   System.out.println(e.getMessage());
            }
 
            return null;
    }
 
    public boolean StoreProcedure(String sql)
    {
 
            try
            {
                    String url = "jdbc:mysql://"+datos[0]+":"+datos[1]+"/"+datos[2];
                    Connection con = DriverManager.getConnection(url, datos[3],datos[4]);
                    Statement s = con.createStatement();
 
                    s.execute(sql);
 
                    s.close();
                    con.close();
                    return true;
 
            }
            catch(Exception e)
            {
                   System.out.println(e.getMessage());
                   return false;
            }
    }
    
}
