package PatternsStriver;


import java.util.Scanner;

public class InvertedRightPyramid {
    static void main() {
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows you want: ");
        int num = scan.nextInt();
        for (int row = num; row > 0; row--) // this for loop represents number of rows
             {
            for (int col = 1; col <=row ; col++)// this for loop represents number of columns
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
