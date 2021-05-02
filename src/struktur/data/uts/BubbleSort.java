package struktur.data.uts;


import java.util.*;


/**
 *
 * @author sahibulNF13
 */
public class BubbleSort {
        
    public static void main(String args[]){
       
//        ArrayList<Integer> angka = new ArrayList<>();
//        ArrayList<Character> huruf = new ArrayList<>();
        
        String kalimat;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Data : ");
        kalimat = input.nextLine();
        kalimat.toLowerCase();
        
        char[] d = kalimat.toCharArray();
//        int dataa = kalimat.length();
        
        int an[] = new int [d.length];
        char ad[] = new char [d.length];
         
        for(int i = 0; i < d.length; i++){ 
            if (d[i] >= '0' && d[i] <= '9'){
                int a;
                a = Character.getNumericValue(d[i]);
                an[i] = a;
            }
            else if (d[i] >= 'a' && d[i] <= 'z'){
                char a = d[i];
                ad[i] = a;
            } 
        }

        int data[] = new int [an.length];
        for (int r = 0; r < an.length; r++) {
            int bil = an[r];
            data[r] = bil;
        }
        
        char kata[] = new char [ad.length];
        for (int r = 0; r < ad.length; r++) {
            char h = ad[r];
            kata[r] = h;
        }
        
//        for (int z = 0; z < data.length; z++) {
//            System.out.print(data[z] + " ");
//        }
        
//        int data_bil[] = new int [data];
//        for (int r = 0; r < data; r++) {
//            int bil = r;
//            data_bil[r] = bil;
//        }
//     
//        char kata[] = new char [kalimat.length()];     
//        for(int r = 0; r < kalimat.length(); r++) {
//            char str = 0;
//           kata[r] = str;
//        }
//        
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
        System.out.print("(descending)\n");
//       
//        System.out.println();
        
        System.out.print("Sorting Data Angka : ");
        for (int x = 0; x < data.length-1; x++){
            int min = x;
            for(int y = x+1; y < data.length; y++){
                if(data[y] < data[min]){                    
                    min = y;
                }
            }
            int temp = data[min];
            data[min] = data[x];
            data[x] = temp;
        }
        
        for (int z = 0; z < data.length; z++) {
            System.out.print(data[z] + " ");
        }
        System.out.print("(ascending)\n");
        
        
  }

}
