package BitwiseOperator;

import java.util.Scanner;

public class RemoveLastSetBit {
    static void main() {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int n= Scan.nextInt();
        n=n&(n-1);
        System.out.println("Removed Last set bit"+n);
    }
}
