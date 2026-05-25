package PatternsStriver;

import java.util.Scanner;

public class InvertedStarPyramid {
    static void main() {
    Scanner scan = new Scanner(System.in);
        System.out.print("enter Number of rows: ");
        int n = scan.nextInt();
//        row
        for (int row = 1; row <=n; row++) {
//            for each row we have variable number of col
//            part1 spaces
            for (int spaces = 1;  spaces <= row -1 ;  spaces++) {
                System.out.print(" ");
            }
//          part 2 stars
            for (int col = 1; col <= 2*(n-row)+1 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
