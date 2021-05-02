/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struktur.data.BelajarDataStruktur;

import java.util.ArrayList;

/**
 *
 * @author sahibulNF13
 */
public class CustomStack {
    
    private int top = 0;
    private ArrayList<Object> stack =  new ArrayList<Object>();
    
    public void push(Object value) {
        stack.add(value);
    }
    
    public int pop() {
        return stack.size();
    }
    
    public void display() {
        for (Object value : stack) {
            System.out.println(value);
        }
    }
}
