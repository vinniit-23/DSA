package Patterns;


import java.util.Scanner;

public class InvertedRightPyramid {
    static void main() {
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows you want: ");
        int num = scan.nextInt();
        for (int i = num; i > 0; i--) // this for loop represents number of rows
             {
            for (int j = 1; j <=i ; j++)// this for loop represents number of columns
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
