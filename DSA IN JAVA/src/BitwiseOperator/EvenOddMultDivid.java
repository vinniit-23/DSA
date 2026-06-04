package BitwiseOperator;

import java.util.Scanner;

public class EvenOddMultDivid {
    static void main() {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n= Scan.nextInt();
        if ((n&1)==1){
            System.out.println("Given number is odd ");
        }else {
            System.out.println("Given number is even ");
        }

        System.out.println("Multiple by 2: "+(n<<1));
        System.out.println("divide by 2: "+(n>>1));
    }
}
