package struktur.data.uts;

import java.util.Scanner;

/**
 *
 * @author sahibulNF13
 */
public class Selection {

   
    public static void printData(int data[]){
        int n = data.length;
        for(int x=0; x<n; x++){
            System.out.print(data[x]+ " ");
        }
    }
    
    public static void sort(int data[]){
        int n = data.length;
        for(int a=0; a<n-1; a++){
            int minIdx = a;
            for(int b=0; b<n; b++){
                if(data[b] <= data[minIdx]){
                    minIdx = b;
                }
            }
            int tampung = data[minIdx];
            data[minIdx] = data[a];
            data[a] = tampung;
        }
    }
    
    
    public static void main(String[] args) {
        
        int data[] = {3,6,8,1,2,9,4};
        Scanner input = new Scanner(System.in);
//        int data = input.nextInt();
        
        
        System.out.println("Data sebelum disorting: ");
        printData(data);
        sort(data);
        System.out.println("Data setelah disorting: ");
        printData(data);
    }
    
}
