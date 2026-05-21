package BasicMaths;

public class ArmstrongNumber {
    static int ArmstrongNumberCheck(int num){
        int Armstrong_digit = 0;
        while (num!=0){
            int digit = num%10;
            int digitCube=digit*digit*digit;
            Armstrong_digit=Armstrong_digit+digitCube;
            num= num/10;
        }

        return Armstrong_digit;
    }

    static void main() {
        int number = 153;
        int Armstrong = ArmstrongNumberCheck(number);
        if (Armstrong == number) {
            System.out.println("Given Number is a Armstrong");
        }else {
            System.out.println("Given Number is not a Armstrong");

        }
    }
}
