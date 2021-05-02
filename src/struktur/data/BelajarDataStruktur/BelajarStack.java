/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struktur.data.BelajarDataStruktur;

import java.util.Stack;

/**
 *
 * @author sahibulNF13
 */
public class BelajarStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Stack stack = new Stack();
        
        stack.push("Java");
        stack.push("Kotlin");
        stack.push(10);
        stack.pop();
        stack.push('C');
       
        System.out.println("Isi Stack :");
        for (Object value : stack) {
            System.out.println(value);
        }
 
        System.out.println("\nIsi Stack :" + stack.search("Java"));
        System.out.println("Isi Stack :" + stack.search("Kotlin"));
        System.out.println("Isi Stack :" + stack.search('C'));
        System.out.println("Isi Stack :" + stack.search(10));
    }
    
}
