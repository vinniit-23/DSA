package NumberSystem;

import java.util.Scanner;

public class BinaryToDecimal {
    static void main() {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter positive decimal: ");
        int n= scan.nextInt();
        int ans =0, i=0;
        while (n!=0){
            int bit = n&1;
            ans=(int)(bit*Math.pow(10,i))+ans;
            n=n>>1;
            i++;
        }
        System.out.println("Binary representation: "+ans);
    }
}
