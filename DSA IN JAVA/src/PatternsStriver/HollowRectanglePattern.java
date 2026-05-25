package PatternsStriver;

import java.util.Scanner;

public class HollowRectanglePattern {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter Number of rows: ");
        int n = scan.nextInt();

        for(int row=1;row<=n;row++){
//            part:1 1st and last row
            if(row==1||row==n){
                for(int col = 1;col<=n;col++){
                    System.out.print("* ");
                }
            }
//            Part:2 Middle rows
            else{
                System.out.print("* ");
                for(int col = 1;col<=n-2;col++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
