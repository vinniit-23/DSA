package PatternsStriver;

import java.util.Scanner;

public class TheNumberPattern {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter Number of rows: ");
        int n = scan.nextInt();

        for (int row = 1; row <=2*n-1 ; row++) {


            for (int col = 1;  col<=2*n-1 ; col++) {
                int top = row-1;
                int left =  col-1;
                int right = 2*n-1-col;
                int buttom = 2*n-1-row;
                int minDistance =  n-Math.min(Math.min(top,buttom),Math.min(right,left));
                System.out.print(minDistance+" ");
            }
                System.out.println();
         }
    }
}
