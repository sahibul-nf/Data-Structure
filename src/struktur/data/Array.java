/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struktur.data;

/**
 *
 * @author sahibulNF13
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a[][] = new int[3][3];
        a[0][0] = 10;
        a[0][1] = 5;
        a[0][2] = 1;
        a[1][0] = 2;
        a[1][1] = 6;
        a[1][2] = 1;
        a[2][0] = 2;
        a[2][1] = 3;
        a[2][2] = 5;

        int b[][] = new int[3][3];
        b[0][0] = 15;
        b[0][1] = 3;
        b[0][2] = 1;
        b[1][0] = 4;
        b[1][1] = 8;
        b[1][2] = 4;
        b[2][0] = 3;
        b[2][1] = 8;
        b[2][2] = 1;
        //
        int array3[][] = new int[3][3];

        System.out.println("\nMatrix a:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatrix b:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nHasil perkalian kedua matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int total = 0;
                for (int k = 0; k < 3; k++) {
                    total = total + (a[i][k] * b[k][j]);

                }
                System.out.print(total + " ");
            }
            System.out.println();
        }

        System.out.println("\nHasil penjumlahan kedua matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int total = 0;
                for (int k = 0; k < 3; k++) {
                    total = total + (a[i][k] * b[k][j]);

                }
                System.out.print(total + " ");
            }
            System.out.println();
        }

    }
}
