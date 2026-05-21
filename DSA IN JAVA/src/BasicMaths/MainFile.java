package BasicMaths;

import java.util.Scanner;
import BasicMaths.DigitCount;

public class MainFile {
    static void main() {
    Scanner scan = new Scanner(System.in);
        int DigitForCount = scan.nextInt();
    DigitCount digitcount= new DigitCount();
        System.out.print("Enter Digit For Counting : ");
        System.out.println("Total Digit in Number is: "+digitcount.CountDigit(DigitForCount));
    }
}
