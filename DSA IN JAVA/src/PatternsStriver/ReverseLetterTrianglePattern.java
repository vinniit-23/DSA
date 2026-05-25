package PatternsStriver;

import java.util.Scanner;

public class ReverseLetterTrianglePattern {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter Number of rows: ");
        int n = scan.nextInt();

        for (int row = n; row >=1 ; row--) {
            for (int col = 1; col <=row ; col++) {
                int a =col;
                int b = ('A'-1);
                int alpha = a+b;
                char finalans = (char)alpha;

                System.out.print(finalans+" ");
            }
            System.out.println();
        }
    }
}
