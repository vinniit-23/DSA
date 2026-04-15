package Patterns;

import java.util.Scanner;

public class InvertedRightNumberpyramid {
    static void main() {

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int num = scan.nextInt();
        for (int i = num; i >0; i--) // This for loop represents number of rows
            {
                for (int j = 1; j <= i; j++)//This for loop represents number of columns
                {
                    System.out.print(j);
                }
                System.out.println();
            }
    }
}
