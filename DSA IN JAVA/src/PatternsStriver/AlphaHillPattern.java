package PatternsStriver;

import java.util.Scanner;

public class AlphaHillPattern {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter Number of rows: ");
        int n = scan.nextInt();

        for (int row = 1; row <= n; row++) {
//            part:1 free spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

//            part:2 alphabet
            for (int col = 1; col <= row; col++) {
                int a = col;
                int b = ('A' - 1);
                int alpha = a + b;
                char finalans = (char) alpha;

                System.out.print(finalans + " ");
            }
            for (int col = row - 1; col >= 1; col--) {
                int a = col;
                int b = ('A' - 1);
                int alpha = a + b;
                char finalans = (char) alpha;

                System.out.print(finalans + " ");
            }


            System.out.println();
        }
    }
}
