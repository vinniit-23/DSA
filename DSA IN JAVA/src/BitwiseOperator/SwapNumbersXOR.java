package BitwiseOperator;

import java.util.Scanner;

public class SwapNumbersXOR {
    static void main() {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int a= Scan.nextInt();
        System.out.print("Enter number2: ");
        int b= Scan.nextInt();

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("Number 1 "+a);
        System.out.println("Number 2 "+b)  ;
    }
}
