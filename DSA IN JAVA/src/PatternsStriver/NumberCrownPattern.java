package PatternsStriver;

import java.util.Scanner;

public class NumberCrownPattern {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter Number of rows: ");
        int n = scan.nextInt();

        for(int row = 1; row<=n;row++){
//            part:1 right triangle
            for(int col =1;col<=row;col++){
                System.out.print(col+" ");
            }
//            part:2 spaces
            for(int space =1; space<=2*(n-row);space++){
                System.out.print("  ");
            }

//            part:3 left triangle
            for(int col =row;col>=1;col--){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
