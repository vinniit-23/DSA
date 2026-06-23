package PatternsStriver;

import java.util.Scanner;

public class IncreasingLetterTrianglePattern {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter Number of rows: ");
        int n = scan.nextInt();

        for (int row = 1; row <= n; row++) {
            for (char col = 'A'; col <= 'A' + row - 1; col++) {
//        int a =col;
//        int b = ('A'-1);
//        int alpha = a+b;
//        char finalans = (char)alpha;

                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
