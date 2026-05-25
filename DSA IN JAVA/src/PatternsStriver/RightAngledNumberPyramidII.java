package PatternsStriver;

import java.util.Scanner;

public class RightAngledNumberPyramidII {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter Number of rows: ");
        int num = scan.nextInt();
        for (int row = 1; row <= num; row++) { // this is for number of rows
            for (int col = 1; col <=row ; col++) {// this is for number of columns
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
