/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struktur.data;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author sahibulNF13
 */
public class SelectionSort {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        ArrayList <Character> huruf = new ArrayList<>();
        ArrayList <Integer> angka = new ArrayList<>();
        
        System.out.print("Masukkan Data : ");
        String kalimat = input.nextLine();
        kalimat.toLowerCase();
        char[] kata = kalimat.toCharArray();
        
        int kata3;        
        char kata2;
        
        for(int i = 0; i < kata.length; i++){ 
            if (kata[i] >= '0' && kata[i] <= '9'){
                kata2 = kata[i];
                kata3 = Character.getNumericValue(kata2);
                angka.add(kata3);
            }
            else if (kata[i] >= 'a' && kata[i] <= 'z'){
                kata2 = kata[i];
                huruf.add(kata2);
            } 
        }
     
        int data_bil[] = new int [angka.size()];
        for (int r = 0; r < angka.size(); r++) {
            int bil = angka.get(r);
            data_bil[r] = bil;
        }
     
        char data_huruf[] = new char [huruf.size()];     
        for(int r = 0; r < huruf.size(); r++) {
            char str = huruf.get(r);
           data_huruf[r] = str;
        }
        
        System.out.print("\nSorting Data Huruf : ");
        for (int x = 0; x < data_huruf.length-1 ; x++){
            int min = x;
            for(int y = x+1; y < data_huruf.length; y++){
                if(data_huruf[y] > data_huruf[min]){                    
                    min = y;
                }
            }
            char temp = data_huruf[min];
            data_huruf[min] = data_huruf[x];
            data_huruf[x] = temp;
        }
        
        for (int z = 0; z <data_huruf.length; z++) {
            System.out.print(data_huruf[z] + " ");
        }
        System.out.print("(descending)\n");
       
        System.out.println();
        
        System.out.print("Sorting Data Angka : ");
        for (int x = 0; x < data_bil.length-1; x++){
            int min = x;
            for(int y = x+1; y < data_bil.length; y++){
                if(data_bil[y] < data_bil[min]){                    
                    min = y;
                }
            }
            int temp = data_bil[min];
            data_bil[min] = data_bil[x];
            data_bil[x] = temp;
        }
        
        for (int z = 0; z < data_bil.length; z++) {
            System.out.print(data_bil[z] + " ");
        }
        System.out.print("(ascending)\n");
        
    }
}
