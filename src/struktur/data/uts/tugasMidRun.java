package struktur.data.uts;

import java.util.Scanner;
/**
 *
 * @author sahibulNF13
 */
public class tugasMidRun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int inputAngka, h = 0, bayar = 0;
        int jumlah[] = new int [10];
        int harga[] = {15000, 22000, 17500};
        
        
        String p = "Y",inputKode, pilihanMenu = "";
        String uD = "Pecel Lele Bang Baka";
        String kode[][] = {
            {"1", "A   ", "Lele Goreng ", "Rp ", "15000"},
            {"2", "B   ", "Lele Penyet ", "Rp ", "22000"},
            {"3", "C   ", "Lele Bakar  ", "Rp ", "17500"}
        };
        
        Scanner input = new Scanner(System.in);
        System.out.println(uD);
        System.out.println("Menu Hari Ini");
        System.out.println("------------------------------------");
        System.out.println("Kode  " + "Nama Menu     " + "Harga");
        System.out.println("------------------------------------");
        
        for(int i=0; i<kode.length; i++){
            for (int j=1; j<kode[1].length; j++){
                System.out.print(kode[i][j] + "  ");
            }
            System.out.println();
        }
        
        System.out.println("------------------------------------");
        System.out.println();
 
        while (p.equals("Y") || p.equals("y")) {
            System.out.println("Mau Pesan Apa? (input kode menu)");
            inputKode = input.next();

            System.out.println("Berapa porsi? (input angka)");
            inputAngka = input.nextInt();

            switch (inputKode) {
                case "A":
                case "a":

                    jumlah[h] = inputAngka*harga[0];
                    pilihanMenu += kode[0][0] + "     " + kode[0][1] + " " + kode[0][2] + "      " + inputAngka + "        " + kode[0][3] + jumlah[h] +"\n";
                    h++;
                    
                    break;
                    
                case "B":
                case "b":
                    jumlah[h] = inputAngka*harga[1];
                    pilihanMenu += kode[1][0] + "     " + kode[1][1] + " " + kode[1][2] + "      " + inputAngka + "        " + kode[1][3] + jumlah[h] +"\n";
                    h++;
                    
                    break;
                    
                case "C":
                case "c":
                    
                    jumlah[h] = inputAngka*harga[2];
                    pilihanMenu += kode[2][0] + "     " + kode[2][1] + " " + kode[2][2] + "      " + inputAngka + "        " + kode[2][3] + jumlah[h] +"\n";
                    h++;
                    
                    break;
                    
                default:
                    System.out.println("Maaf, menu yang anda cari tidak ada dalam daftar menu");
                    break;
            }
            
            System.out.println("Mau tambah lagi? (input Y,y/n,t)");
            p = input.next();
           
        }
        
        for(int i=0; i<h; i++){
        bayar += jumlah[i];
        }
        
        int pajak = bayar * 10/100;
        int diskon;
        
        if(bayar >= 100000 && bayar < 200000){
            diskon = (bayar  + pajak) * 10/100; 
        }
        else if(bayar >= 200000 && bayar < 500000){
            diskon = (bayar + pajak) * 15/100;
        }
        else if(bayar >=500000){
            diskon = (bayar +pajak) * 20/100;
        }
        else{
            diskon = 0;
        }
        
        int total = bayar + pajak - diskon;
        
        System.out.println();
        System.out.println(uD);
        System.out.println("-----------------------------------------------------------");
        System.out.println("No.  " + "Kode  " + "Nama Menu       " + "Banyak     " + "Jumlah");
        System.out.println("-----------------------------------------------------------");
        System.out.println(pilihanMenu);
        System.out.println("-----------------------------------------------------------");
        System.out.println("                     Jumlah Bayar     RP " + bayar);
        System.out.println("                        Pajak 10%     RP " + pajak);
        System.out.println("                          Diskon*     RP " + diskon);
        System.out.println("                      Total bayar     RP " + total);
        
    }    
}
    
