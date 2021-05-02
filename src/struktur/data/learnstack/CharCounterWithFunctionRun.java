/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struktur.data.learnstack;

import java.util.Scanner;

/**
 *
 * @author sahibulNF13
 */
public class CharCounterWithFunctionRun {
    
    public static void main(String[] args) {        
        System.out.println("Inputkan sebuah kalimat:");
        CharCounterWithFunction function = new CharCounterWithFunction();
          
        System.out.println("====================================");
        System.out.println("Juimlah huruf dalam kalimat adalah = " + function.huruf()); 
        System.out.println("Jumlah angka dalam kalimat adalah = " +function.angka());
        System.out.println("====================================");
                    
        }    
      
    }    

