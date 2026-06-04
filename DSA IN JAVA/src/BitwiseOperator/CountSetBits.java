package BitwiseOperator;

import java.util.Scanner;

public class CountSetBits {
    static void main() {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n= Scan.nextInt();
        int count =0;
        while (n!=0){
            if((n&1)==1){
                count++;
            }
          n= n>>1;
        }
        System.out.println("Number of setbits: "+count);
    }
}
