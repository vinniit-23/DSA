package PatternsStriver;

import java.util.Scanner;

public class SymmetricButterflyPattern {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter Number of rows: ");
        int n = scan.nextInt();

//        upper part
        for (int  row = 1;   row<=n ;   row++) {


//            part:1 upper left angle triangle
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }


//            part:2 spaces
            for (int col = 1; col <=2*(n-row) ; col++) {
                System.out.print("  ");
            }

//            part:3 upper right angle triangle
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }


//        lower part
        for (int row = 2; row <=n ; row++) {

//          part:4 lower left angle triangle
            for (int col = 1; col <= (n-row)+1 ; col++) {
                System.out.print("* ");
            }


//          part:5 spaces
            for (int col = 1; col <= 2*(row-1) ; col++) {
                System.out.print("  ");
            }


//          part:4 lower left angle triangle
            for (int col = 1; col <= (n-row)+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
