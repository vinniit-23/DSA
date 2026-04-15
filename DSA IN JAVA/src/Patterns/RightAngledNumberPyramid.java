package Patterns;

import java.util.Scanner;

public class RightAngledNumberPyramid {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter Number of rows: ");
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) { // this is for number of rows
            for (int j = 1; j <=i ; j++) {// this is for number of columns
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
