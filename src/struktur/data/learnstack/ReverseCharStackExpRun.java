/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struktur.data.learnstack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author sahibulNF13
 * 
 * program membalikkan karakter huruf atau angka
 */
public class ReverseCharStackExpRun {

    public static void main(String[] args) {
      String karakter = "";
      String angka = "";
      String huruf = "";
      String kata = "";
      

      Stack tumpukan = new Stack();
      Scanner masukan = new Scanner(System.in);
      System.out.print("Tuliskan sesuatu: ");
      karakter = masukan.nextLine();
      
      int data = karakter.length();
      
      // Membalikkan kalimat
      for(int i = data-1 ; i >= 0 ; i--){
        kata += karakter.charAt(i);
      }
      
//      Mengambil angka saja dengan terbalik
        for (int i = data-1 ; i >= 0 ; i--) {
            if(karakter.charAt(i) >= '0' && karakter.charAt(i) <= '9'){
            angka += tumpukan.push(karakter.charAt(i));
            }
        }
        
//      Mengambil huruf saja dengan terbalik
        for (int i = data-1 ; i >= 0 ; i--) {
            if(karakter.charAt(i) >= 'a' && karakter.charAt(i) <= 'z'){
            huruf += tumpukan.push(karakter.charAt(i));
            }
        }
        
   
      // Isi Stack   
      System.out.println();
      System.out.println("Hasil balik kalimat: " +kata);
      System.out.println("Hasil ambil angka: " +angka);
      System.out.println("Hasil ambil huruf: " +huruf);

    }
}
    

