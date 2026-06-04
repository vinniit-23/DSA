package BitwiseOperator;

import java.util.Scanner;

public class GetLastSetBitVal {
    static void main() {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int n= Scan.nextInt();
        n=n&(-n);
        System.out.println("Getted Last set bit"+n);
    }
}
