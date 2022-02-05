/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hoja2_ed;

/**
 *
 * @author jsken
 */
public interface IStack<T> {
    void push(T value);
	
	T pull();
	
	T peek();
	
	int count();
	
	boolean isEmpty();
}
