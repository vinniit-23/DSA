package PatternsStriver;

import java.util.Scanner;

public class HalfDiamondStarPattern {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter Number of rows: ");
        int n = scan.nextInt();

//        upper right angle triangle
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        Lower Right angle triangle
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
