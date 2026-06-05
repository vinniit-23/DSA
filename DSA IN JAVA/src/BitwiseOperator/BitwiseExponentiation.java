package BitwiseOperator;

import java.util.Scanner;

public class BitwiseExponentiation {
    static void main() {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base= Scan.nextInt();
        System.out.print("Enter exponent: ");
        int exponent= Scan.nextInt();
 int ans=1;
 while (exponent!=0){
     int bit =exponent&1;
     if (bit==1) ans*=base;
     base*=base;
     exponent=exponent>>1;

 }
        System.out.println("Answer : "+ans);
    }
}
