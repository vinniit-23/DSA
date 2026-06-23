package PatternsStriver;

import java.util.Scanner;

public class BinaryNumberTrianglePattern {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter Number of rows: ");
        int n = scan.nextInt();

        int start;
        for (int row = 1; row <= n; row++) {
            if (row % 2 == 0) start = 1;
            else start = 0;
            for (int col = 1; col <= row; col++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
}
