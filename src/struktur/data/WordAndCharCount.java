/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struktur.data;

import java.util.Scanner;

/**
 *
 * @author sahibulNF13
 */
public class WordAndCharCount {
    
    private static final int JUMLAH_KARAKTER = 256;
    private static int[] total_per_karakter = new int[JUMLAH_KARAKTER];
 
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
 
        System.out.print("\nMasukan string : ");
        String kata = s.nextLine();
        kata = kata.toLowerCase();
 
        // inisialisasikan setiap karakter berjumlah 0 buah
        for (int i=0; i<JUMLAH_KARAKTER; i++) {
            total_per_karakter[i] = 0;
        }
 
        // hitung jumlah setiap karakter
        int kata_len = kata.length();
        for (int i=0; i<kata_len; i++) {
            total_per_karakter[(int )kata.charAt(i)]++;
        }
 
        // tampilkan jumlah setiap karakter
        System.out.println();
        for (int i=0; i<JUMLAH_KARAKTER; i++) {
            if (total_per_karakter[i] > 0) {
                if (((char)i >= 'a' && (char)i <= 'z')) {
                    System.out.println("Jumlah huruf " + (char) i + " ada sebanyak " + total_per_karakter[i] + " buah");
                } else if ((char)i >= '0' && (char)i <= '9') {
                    System.out.println("Jumlah angka " + (char) i + " ada sebanyak " + total_per_karakter[i] + " buah");
                } else if ((char) i == ' ') {
                    System.out.println("Jumlah Spasi ada sebanyak " + total_per_karakter[i] + " buah");
                } else {
                    System.out.println("Jumlah karakter " + (char) i + " ada sebanyak " + total_per_karakter[i] + " buah");
                }
            }
        }
 
        // hitung jumlah kata
        int jumlahKata = 0;
        int i = 0;
        while (i < kata.length()) {
            // abaikan spasi pada awal string dan spasi lebih dari satu
            while (i < kata.length() && kata.charAt(i) == ' ') i++; 
 
            if (i < kata.length() && kata.charAt(i) != ' ') {
                jumlahKata++;
                while (i < kata.length() && kata.charAt(i) != ' ') i++;
            }
        }
 
        System.out.println("\nJumlah Kata : " + jumlahKata + " buah");

        s.close();
    }
    

}
    
        
        

