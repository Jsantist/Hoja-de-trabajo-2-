/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2_ed;
import java.io.BufferedReader;
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
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        System.out.println("ingrese una cadena ");
        cadena = br.readLine();
        System.out.println(cadena);
        String[] parts =  cadena.split("");
        List<String> partes = Arrays.asList(parts);
        System.out.println(partes);
        System.out.println(partes.get(0));
        
        Operaciones<Integer> operando = new Operaciones ();
        
         for (int i=0;i<partes.size();i++){
            if (Character.isDigit(cadena.charAt(i))){
                System.out.println(partes.get(i)+"es dígito");
            }
            else{
                System.out.println(partes.get(i)+"no es digito");
            }
        }
        
        int total = operando.Evaluate(cadena);
        System.out.println(total);
                
        
          
       
    }

    
}
