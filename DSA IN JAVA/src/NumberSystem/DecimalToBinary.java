package NumberSystem;

import java.util.Scanner;

public class DecimalToBinary {
    static void main() {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter Binary number: ");
        int n= scan.nextInt();
        int ans =0, i=0;
        while (n!=0){
            int bit = n%10;
            ans=(int)(bit*Math.pow(2,i))+ans;
            n=n/10;
            i++;
        }
        System.out.println("Decimal representation: "+ans);
    }
}
