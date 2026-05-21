package BasicMaths;

public class PalindromeCheck {
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
        int num =12121;
        int reverse = Reverse_Number(num);
        if(reverse == num){
            System.out.println("Given number is palindrome");
        }else{
            System.out.println("Given Number is not a palindrome");

        }
    }
}
