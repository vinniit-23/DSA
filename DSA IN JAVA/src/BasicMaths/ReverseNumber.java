package BasicMaths;


public class ReverseNumber {
static int Reverse_Number(int num){
    int reverse = 0;
    while (num!=0){
        int digit = num%10;
        reverse = reverse*10+digit;
        num = num/10;
    }
    return reverse;
}
    static void main() {
        int Reverse = Reverse_Number(90283);
        System.out.println("Reverse Number: "+Reverse);
    }
}
