package Patterns;

import java.util.Scanner;

public class RightAngledTrianglePattern {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter Number of rows: ");
        int num = scan.nextInt();
        for (int i = 1; i <=num; i++) { // this is for number of rows
            for (int j = 1; j <=i ; j++) {// this is for number of columns
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
* The outermost for loop  for (int i = 1; i <= num; i++) manages the number of rows.
* The innermost for loop for (int j = 1; j <=i ; j++) manages number of columns
* now let understand how its work, the outermost for loop runs first time so i = 1 Now the next line of code is again
* a for loop so it will start running it will run till the condition satisfy if condition became false the innerloop will
* stop running and outerloop start running again now it will one's again and again the inner loop will run until the
* condition is satisfied this process repeats and the pattern print.
*
* The innermost prints horizontally and outermost print vertically.
*
* */
