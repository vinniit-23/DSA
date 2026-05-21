package BasicMaths;

import java.util.Scanner;


public class DigitCount {
public static int CountDigit(int num){
    int Count = 0;
    while (num!=0){
    int Digit = num%10;
    num = num/10;
    Count++;
 }
    return Count;
}

static void Count_Digit(int num){
    while (num!=0){
        int Digit = num%10;
        System.out.println(Digit);
        num = num/10;
    }
}
    static void main() {
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
    int number = scan.nextInt();
    Count_Digit(number);
    int count = CountDigit(number);
//    int i =CountDigit(864579);
//        System.out.println(i);
        System.out.print("Total count is "+count);
    }
}
