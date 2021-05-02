package struktur.data.uts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
        
public class RestoKasir {

    public static void main(String[] args) throws IOException {
        
        
        Scanner scan = new Scanner(System.in);
        BufferedReader input2 = new BufferedReader (new InputStreamReader (System.in));
        
        int input;
        int y = 0;
        
        int hargatotal = 0;
        int porsi = 0;
        int harga[] = new int [100];
    //    int porsi[] = new int [100];
        
        String menu[];
        menu = new String [100];
        String masukan = "Y";
        
        System.out.println("R E S T O R A N   A Y A M - N Y A   I K Y ");
        System.out.println("_______________");
        System.out.println("");
        System.out.println("No.  Menu Ayam              Harga");
        System.out.println("");
        
        String[] eat = {
        "                                   ",
        "  Ayam Penyet            Rp. 145.000,-",
        "  Ayam Bakar             Rp. 145.000,-",
        "  Ayam Panggang          Rp. 170.000,-",
        "  Ayam Geprek            Rp. 130.000,-",
        "  Ayam Santai            Rp. 135.000,-",
        "  Ayam Lepas             Rp. 135.000,-",
        "  Ayam Goreng            Rp. 125.000,-",
        "  Ayam Kampung           Rp. 145.000,-",
        "  Ayam Bonyok            Rp. 135.000,-",
        " Ayam Teler             Rp. 125.000,-",
        };
        
        for (int i = 1; i < eat.length; i++)
            System.out.println(""+i+". "+eat[i]);  
        
        while (masukan.equalsIgnoreCase("Y") || masukan.equalsIgnoreCase("y"))
        {
            
        System.out.println("");
        System.out.print("Mau Pesan Apa? (Input Nomor)    : ");
        input = scan.nextInt();
        
        int p;
        System.out.print("Mau Berapa Porsi? (Input Nomor) : ");
        p = scan.nextInt();
        
        
               switch (input) { 
                    case 1:
                        menu[y] = "1.      Ayam Penyet      "+p;
                        harga[y] = 145000;
                        harga[y] = harga[y]*p;
                        break;
                    case 2:
                        menu[y] = "2.      Ayam Bakar       "+p;
                        harga[y] = 145000;
                        harga[y] = harga[y]*p;
                        break;
                    case 3:
                        menu[y] = "3.      Ayam Panggang    "+p;
                        harga[y] = 170000;
                        harga[y] = harga[y]*p;
                        break;
                    case 4:
                        menu[y] = "4.      Ayam Geprek      "+p;
                        harga[y] = 130000;
                        harga[y] = harga[y]*p;
                        break;
                    case 5:
                        menu[y] = "5.      Ayam Santai      "+p;
                        harga[y] = 135000;
                        harga[y] = harga[y]*p;
                        break;
                    case 6:
                        menu[y]  = "6.      Ayam Lepas       "+p;
                        harga[y] = 135000;
                        harga[y] = harga[y]*p;
                        break;
                    case 7:
                        menu[y] = "7.      Ayam Goreng      "+p;
                        harga[y] = 125000;
                        harga[y] = harga[y]*p;
                        break;
                    case 8:
                        menu[y] = "8.      Ayam Kampung     "+p;
                        harga[y] = 145000;
                        harga[y] = harga[y]*p;
                        break;
                    case 9:
                        menu[y] = "9.      Ayam Bonyok     "+p;
                        harga[y] = 135000;
                        harga[y] = harga[y]*p;
                        break;
                    case 10:
                        menu[y] = "10.     Ayam Teler       "+p;
                        harga[y] = 125000;
                        harga[y] = harga[y]*p;
                        break;
                    default:
                        System.out.println("Nomor yang kamu pilih tidak ada di menu.");
                        break;
                    }
    
                 System.out.print("Mau tambah lagi? Y/T : ");
                 masukan = scan.next();
                   
                    y++;
                    }
        
                    
                                
                    System.out.println("");
                    for (int b = 0; b<y;b++){
                        hargatotal = hargatotal + harga[b];                   
                    }
                    
                    
                    System.out.println("R E S T O R A N   A Y A M - N Y A   I K Y ");
                    System.out.println("__________________");
                    System.out.println("");
                    System.out.println("No.     Menu Ayam       Porsi       @Jumlah");
                    System.out.println("");
                   
                    for (int a = 0; a<y; a++){
                        
                    System.out.println(menu[a]+" "+"         Rp. "+harga[a]+"");
                //    System.out.println("         Rp. "+harga[a]+"");
                        }
                    System.out.println("__________________");
                    
                    //Jumlah Bayar
                //    hargatotal = hargatotal*porsi;
//                    hargatotal = hargatotal+y;
                    System.out.println("        Jumlah Pembayaran           Rp. "+hargatotal);
                    
                    //Pajak
                    int p = hargatotal*10/100;
                    System.out.println("        Pajak 10%                   Rp. "+p);
                    
                    //Disc
                    int disc;
                    if (hargatotal >= 100000 && hargatotal < 200000)
                    {
                        disc = (hargatotal + p) * 10/100;
                    }
                    else if (hargatotal >= 200000 && hargatotal < 500000)
                    {
                        disc = (hargatotal + p) * 15/100;
                    }
                    else if (hargatotal >= 500000)
                    {
                        disc = (hargatotal + p) * 20/100;
                    }
                    else
                    {
                        disc = 0;
                    }
                    System.out.println("        Disc                        Rp. "+disc);

                    //Total Bayar
                    hargatotal = hargatotal+p-disc;
                    System.out.println("        Total bayar Anda            Rp. "+hargatotal);
                        
}
}
