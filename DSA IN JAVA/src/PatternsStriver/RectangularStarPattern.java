package PatternsStriver;

import java.util.Scanner;

public class RectangularStarPattern {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of rows you want to print");
        int Num = scan.nextInt();
        for (int row = 0; row <Num ; row++) {
            for (int col = 0; col < Num; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
