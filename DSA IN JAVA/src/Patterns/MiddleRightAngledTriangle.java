package Patterns;

import java.util.Scanner;

public class MiddleRightAngledTriangle {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number of rows you want to print: ");
        int num = scan.nextInt();
        for (int i = 0; i < num ; i++) {
            for (int j = 0; j < num-i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < num-i-1 ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
