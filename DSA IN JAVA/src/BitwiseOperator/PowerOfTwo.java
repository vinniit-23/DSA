package BitwiseOperator;

import java.util.Scanner;

public class PowerOfTwo {
    static void main() {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n= Scan.nextInt();
        if ((n&(n-1))==0){
            System.out.println("Given number is power of two");
        }else {
            System.out.println("Given number is not power of two");
        }
    }
}
