/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2_ed;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author jsken
 */
public class Operaciones<T> implements IStack<T>, IPostfixCalc {
    
    Stack<T> pila = new Stack();

    @Override
    public int Evaluate(String dato) {
        Operaciones<Integer> opera = new Operaciones();
        String[] parts =  dato.split("|");
        List<String> partes = Arrays.asList(parts);
        int i;
        
        for (i=0;i<=partes.size();i++){
          if (pila.size()>1){  
            if (Character.isDigit(dato.charAt(i))){
                int numero;
                numero = Integer.parseInt(partes.get(i));
                opera.push(numero);
            }else if(partes.get(i)== "+") {
                int numero1;
                int numero2;
                int total;
                
                numero1=opera.pull();
                numero2=opera.pull();
                
                total= numero1 + numero2;
                opera.push(total);
                
            }else if(partes.get(i)== "-"){
                int numero1;
                int numero2;
                int total;
                
                numero1=opera.pull();
                numero2=opera.pull();
                
                total= numero1 - numero2;
                opera.push(total);
                
            }else if(partes.get(i)== "*"){
                int numero1;
                int numero2;
                int total;
                
                numero1=opera.pull();
                numero2=opera.pull();
                
                total= numero1 * numero2;
                opera.push(total);
                
            }else if(partes.get(i)== "/"){
                int numero1;
                int numero2;
                int total;
                
                numero1=opera.pull();
                numero2=opera.pull();
                
                total= numero1 / numero2;
                opera.push(total);
                
            }else {
                System.out.println("esta operación no se puede realizar");
            }
          } 
            
            
        }
        
        
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void push(T value) {
       pila.push(value);
    }

    @Override
    public T pull() {
        return pila.remove(0);
    }

    @Override
    public T peek() {
        return pila.get(0);
    }

    @Override
    public int count() {
        return pila.size();
    }

    @Override
    public boolean isEmpty() {
        return pila.isEmpty();
    }

    
     
    
    
    
}
