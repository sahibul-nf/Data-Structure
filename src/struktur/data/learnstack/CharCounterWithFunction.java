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
class CharCounterWithFunction {
    //String string = "Hari ini jam 15.30 terjadi 2 kali gempa"; 
    Scanner input = new Scanner(System.in);
    String kalimat = input.nextLine();
    
    int angka(){
        int count = 0;
        for(int i = 0; i < kalimat.length(); i++) { 
            if (kalimat.charAt(i) >= '0' && kalimat.charAt(i) <= '9'){  
                count++;
               //System.out.println("Total number of characters in a string: " + count);  
            }   
        }
        return count;
    }
        
    int huruf(){
        int hitung = 0;
        kalimat = kalimat.toLowerCase();
        for(int i = 0; i < kalimat.length(); i++) { 
            if (kalimat.charAt(i) >= 'A' && kalimat.charAt(i) <= 'Z'){  
                hitung++;     
            }
        }
        return hitung;
    }
}