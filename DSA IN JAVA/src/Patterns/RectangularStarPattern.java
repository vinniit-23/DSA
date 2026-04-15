package Patterns;

import java.util.Scanner;

public class RectangularStarPattern {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of rows you want to print");
        int Num = scan.nextInt();
        for (int i = 0; i <Num ; i++) {
            for (int j = 0; j < Num; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }

    }
}
