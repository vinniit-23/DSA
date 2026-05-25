package PatternsStriver;

import java.util.Scanner;

public class InvertedNumberedRightPyramid {
    static void main() {

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int num = scan.nextInt();
        for (int row = num; row >0; row--) // This for loop represents number of rows
            {
                for (int col = 1; col <= row; col++)//This for loop represents number of columns
                {
                    System.out.print(col+" ");
                }
                System.out.println();
            }
    }
}
