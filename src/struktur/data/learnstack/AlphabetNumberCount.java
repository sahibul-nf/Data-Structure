package struktur.data.learnstack;

import java.util.Scanner;
/**
 * @author sahibulNF13
 */
public class AlphabetNumberCount {
    Scanner input = new Scanner(System.in);
    String karakter = input.nextLine();
    
    void hitungJumlahAngka (){
        int hitung = 0;
        for(int i=0; i<karakter.length(); i++) {
            if(karakter.charAt(i) >= '0' && karakter.charAt(i) <= '9'){
                hitung++;
            }
        }
        System.out.println("jumlah angka = " +hitung);
    }
    
    void hitungJumlahHuruf (){
        int hitung = 0;
        karakter = karakter.toLowerCase();
        for(int i=0; i<karakter.length(); i++) {
            if(karakter.charAt(i) >= 'a' && karakter.charAt(i) <= 'z'){
                hitung++;
            }
        }
        System.out.println("jumlah huruf = " +hitung);
    }
}

