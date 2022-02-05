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
public class Vector<T> implements IStack<T>, IPostfixCalc {
    
    Stack<T> pila = new Stack();

    @Override
    public int Evaluate(String dato) {
        //la cadena ingresada se convierte en lista 
        String cadena = dato;
        Vector<Integer> opera = new Vector();
        String[] parts =  dato.split("|");
        List<String> partes = Arrays.asList(parts);
        int i;
        //utiliza la lista creada para Operar cada uno de los caracteres dentro de la misma
        for (i=0;i<partes.size();i++){
            //verifica si el caracter es un número o un operando 
            //si es número se agrega a la pila , sino se opera con el valor mas reciente de la pila 
            if (Character.isDigit(cadena.charAt(i))){
                
                int numero;
                numero = Integer.parseInt(partes.get(i));
                opera.push(numero);
            }else if(partes.get(i).equals("+")) {
                int numero1;
                int numero2;
                int total;
                
                numero1=opera.pull();
                numero2=opera.pull();
                
                total= numero1 + numero2;
                opera.push(total);
                if(pila.size()==1){
                    break;
                }
                
            }else if(partes.get(i).equals("-")){
                int numero1;
                int numero2;
                int total;
                
                numero1=opera.pull();
                numero2=opera.pull();
                
                total= numero1 - numero2;
                opera.push(total);
                if(pila.size()==1){
                    break;
                }
                
            }else if(partes.get(i).equals("*")){
                int numero1;
                int numero2;
                int total;
                
                numero1=opera.pull();
                numero2=opera.pull();
                
                total= numero1 * numero2;
                opera.push(total);
                if(pila.size()==1){
                    break;
                }
                
            }else if(partes.get(i).equals("/")){
                int numero1;
                int numero2;
                int total;
                
                numero1=opera.pull();
                numero2=opera.pull();
                
                total= numero1 / numero2;
                opera.push(total);
                if(pila.size()==1){
                    break;
                }
                
            }else {
                System.out.println("esta operación no se puede realizar debido a que el indice es incorrecto "+i);
            }
          
            
            
        }
        
        
         return opera.peek();
    }

    @Override
    public void push(T value) {
       pila.push(value);
    }

    @Override
    public T pull() {
        return pila.pop();
    }

    @Override
    public T peek() {
        return pila.peek();
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
