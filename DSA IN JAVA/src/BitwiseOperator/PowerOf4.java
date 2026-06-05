package BitwiseOperator;

import java.util.Scanner;

public class PowerOf4 {
    static void main() {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num= Scan.nextInt();

//Without using bitwise operator
//        if (num%4==0){
//        System.out.println("Given number " +num+" is power of 4 ");
//        }else{
//        System.out.println("Given number " +num+" is not power of 4 ");
//        }


//        With using bitwise operator
        int n=num;
        int count=0;
        while(n!=0){
            int bit=n&1;
            count++;
            if(bit==1){
                break;
            }
            n=n>>1;
        }
        if ((count&1)==1) {
            System.out.println("the number "+num+" is power of 4");
        }else{
            System.out.println("the number "+num+" is not power of 4");
        }

    }
}
