
package struktur.data;

import java.util.Scanner;

public class SelectionSort_NoArrarList {

  
    public static void main(String[] args) {
        String kalimat;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Data : ");
        kalimat = input.nextLine();
        System.out.println();
        
        kalimat.toLowerCase();
        char[] d = kalimat.toCharArray();
        
        char data[] = new char [d.length];
        char kata[] = new char [d.length];
         
        for(int i = 0; i < d.length; i++){ 
            if (d[i] >= '0' && d[i] <= '9'){
                char a = d[i];
//                a = Character.getNumericValue(i);
                data[i] = a;
            }
            if (d[i] >= 'a' && d[i] <= 'z'){
                char a = d[i];
                kata[i] = a;
            }
        }
            
        System.out.print("Sorting Data Huruf : ");
        for (int x = 0; x < kata.length-1 ; x++){
            int min = x;
            for(int y = x+1; y < kata.length; y++){
                if(kata[y] > kata[min]){                    
                    min = y;
                }
            }
            char temp = kata[min];
            kata[min] = kata[x];
            kata[x] = temp;
        }
        
        for (int z = 0; z <kata.length; z++) {
            System.out.print(kata[z] + " ");
        }
        
        
        System.out.print("Sorting Data Angka : ");
        for (int x = 0; x < data.length-1; x++){
            int min = x;
            for(int y = x+1; y < data.length; y++){
                if(data[y] > data[min]){                    
                    min = y;
                }
            }
            char temp = data[min];
            data[min] = data[x];
            data[x] = temp;
        }
        
        for (int z = 0; z < data.length; z++) {
            System.out.print(data[z] + " ");
        }
        System.out.print("(ascending)\n");
        
    }
}
    

    
    
