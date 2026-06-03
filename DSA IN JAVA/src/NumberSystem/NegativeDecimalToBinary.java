package NumberSystem;

import java.util.Scanner;

public class NegativeDecimalToBinary {
    static void main() {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter Decimal number: ");
        int n = scan.nextInt();
//        int n =Math.abs(num);
         String finalans="";
//       String binary = String.format("%32s",Integer.toBinaryString(n).replace(' ','0'));
         for (int i = 0; i < 32; i++) {
            int bit = n&1;
 //            finalans=finalans+ans;
            finalans=String.valueOf(bit)+finalans;
            n=n>>1;
         }
        System.out.println("binary representation: "+finalans);
    }
}
