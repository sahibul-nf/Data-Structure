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
 */
public class StackReverseChar {

  public static void main(String[] args) {
    String kalimat = "";
    String akhir = "";
    String dan = "";

    Stack<Character> tumpukan = new Stack<Character>();
    Scanner masukan = new Scanner(System.in);
    System.out.print("Masukkan kata atau kalimat : ");
    kalimat = masukan.nextLine();

    int balik = kalimat.length();
    for (int i = balik - 1; i >= 0; i--) {
      if (kalimat.charAt(i) >= '0' && kalimat.charAt(i) <= '9') {
        akhir += tumpukan.push(kalimat.charAt(i));
      }
    }

    for (int i = balik - 1; i >= 0; i--) {
      dan += kalimat.charAt(i);
    }
    // -- Tampilkan isi Stack
    System.out.println(akhir);
    System.out.print("Hasil : ");
    // if(!tumpukan.empty()){
    // Object elemen = tumpukan.pop();
    // System.out.print(elemen);
    // }
    System.out.println(dan);
    Object da = tumpukan.peek();
    System.out.println(da);

    Object daa = tumpukan.pop();
    System.out.println(daa);
    Object dar = tumpukan.pop();
    System.out.println(dar);

    Object s = tumpukan.size();
    System.out.println(s);

    masukan.close();

  }

  // String angka = kalimat.replaceAll("[^0-9.]", "");
  //
  // int balik = angka.length();
  // for (int i = balik-1 ; i >= 0 ; i--) {
  // akhir = akhir+angka.charAt(i);

  // public static void main(String[] args) {
  // Scanner input = new Scanner(System.in); //Membuat scanner input
  // char[] huruf = new char[50]; //menyimpan huruf yang berbeda
  // int[] jumlahHuruf = new int[50]; //menyimpan jumlah setiap huruf berbeda
  // int jumlahHurufBerbeda = 0; //total huruf yang berbeda
  // String kalimat; //kalimat yang diinput
  //
  // //meminta masukan data untuk kalimat
  // System.out.print("Masukan kalimat : ");
  // kalimat = input.nextLine();
  //
  // if(kalimat.isEmpty()){ //mengecek jika kalimat kosong
  // System.out.println("Masukan kosong");
  // } else {
  // //jika kalimat tidak kosong, lanjutkan
  //
  // huruf[0] = kalimat.charAt(0); //menyimpan huruf pertama
  // jumlahHuruf[0] = 1; //jumlah huruf pertama masih 1
  // jumlahHurufBerbeda = 1; //total huruf berbeda masih satu
  //
  // //mengecek setiap huruf di kalimat
  // for(int i = 1; i < kalimat.length(); i++){
  // boolean sudahMuncul = false; //menyimpan apakah huruf sudah muncul
  // //mengecek apakah huruf ke-i sudah pernah muncul
  // for(int j = 0; j < jumlahHurufBerbeda; j++){
  // //jika huruf sudah pernah muncul
  // if(kalimat.charAt(i) == huruf[j]){
  // sudahMuncul = true;
  // jumlahHuruf[j] += 1;
  // }
  // }
  // //jika belum muncul
  // if(!sudahMuncul){
  // //menambahkan huruf baru
  // huruf[jumlahHurufBerbeda] = kalimat.charAt(i);
  // jumlahHuruf[jumlahHurufBerbeda] = 1;
  // jumlahHurufBerbeda++;
  // }
  // }
  // //Mencetak hasil output
  // System.out.println("\nHasil :");
  // for(int i = 0; i < jumlahHurufBerbeda; i++){
  // System.out.println("Huruf " + huruf[i] + " : " + jumlahHuruf[i] + " buah");
  // }
  // }
  // }
}
