package PatternsStriver;

import java.util.Scanner;

public class DiamondStarPattern {
    static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter Number of rows: ");
        int num = scan.nextInt();

//        upper triangle
        for (int row = 1; row <=num ; row++) {
//            part:1 spaces
            for (int spaces = 1; spaces <=num-row ; spaces++) {
                System.out.print(" ");
            }
//            part:2 upper star
            for (int col = 1; col <=2*row-1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        Lower Triangle
        for(int row = 1; row<=num;row++){
//            part:3 spaces
            for(int space =1; space<=row-1;space++){
                System.out.print(" ");
            }
//            part:4 lower star
            for(int col =1; col<=2*(num-row)+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }
}
