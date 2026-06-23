package PatternsStriver;

import java.util.Scanner;

public class AlphaTrianglePattern {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter Number of rows: ");
        int n = scan.nextInt();

        for (int row = 1; row <= n; row++) {
//                int a =row;
            int b = 'A';
            int alpha = b + n - row;
            for (int col = 1; col <= row; col++) {
                char finalans = (char) alpha;
                System.out.print(finalans + " ");
                alpha = alpha + 1;
            }
            System.out.println();
        }
    }
}
