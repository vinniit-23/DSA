package BasicMaths;

import java.util.Scanner;

public class SumOfDigit {
static int DigitSum(int num){
    int sum = 0;
while (num!=0){
    int digit = num%10;
    sum = sum+digit;
    num = num/10;
}
  return sum;
}
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = scan.nextInt();
    int sum = DigitSum(number);
        System.out.print("Sum of number is: "+sum);
    }
}
