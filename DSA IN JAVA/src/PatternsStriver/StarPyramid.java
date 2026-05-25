package PatternsStriver;

import java.util.Scanner;

public class StarPyramid {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int num = scan.nextInt();
        for (int row = 1; row <= num ; row++) {
            for (int space = 1; space <= num-row ; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*row-1; col++) {
                System.out.print("* ");
            }
//            for (int j = 1; j <= num-i-1 ; j++) {
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }
}
