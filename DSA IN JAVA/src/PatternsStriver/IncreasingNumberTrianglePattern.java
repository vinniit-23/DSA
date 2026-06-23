package PatternsStriver;

import java.util.Scanner;

public class IncreasingNumberTrianglePattern {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter Number of rows: ");
        int n = scan.nextInt();
        int count = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

    }
}
