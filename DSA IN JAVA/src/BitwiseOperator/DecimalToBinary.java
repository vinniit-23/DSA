package BitwiseOperator;

import java.util.Scanner;

public class DecimalToBinary {
    static void main() {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n= Scan.nextInt();
        int ans=0;
        int i=0;
        while (n!=0){
            int bit = n&1;
            ans=(int)(bit*Math.pow(10,i))+ans;
            n=n>>1;
            i++;
        }
        System.out.println("Decimal to binary conversion"+ans);
    }
}
