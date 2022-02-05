/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2_ed;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author Telus
 */
public class Hoja2_ED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        File Archivo;
        Archivo = new File("datos.txt");
        Datos dat = new Datos();
        
        System.out.println("Bienvenido a calculadora ");
        
        if (!Archivo.exists()){
            try{
                Archivo.createNewFile();
                System.out.println("Al parecer no hay ningún usuario creado, por favor registrate");
                dat.newOperation(Archivo);
                
            }catch(IOException ex){
                System.out.println(ex);
            }
        }else{
            dat.leerOperaciones(Archivo);
        }
                
        
          
       
    }

    
}

