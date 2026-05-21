package BasicMaths;

public class PerfectNumber {
//    static boolean CheckPerfectNumber(int num) {
//        int sum = 1;
//        for (int firstNumber = 2; firstNumber*firstNumber <= num; firstNumber++) {
//            if (num % firstNumber == 0) {
//                int secondNumber = num/firstNumber;
//                sum=firstNumber+secondNumber+sum;
//            }
//        }
//        if (sum == num) {
//            return true;
//        }else {
//            return false;
//        }
//    }
    static int Check_PerfectNumber(int num) {
        int sum = 0;
        for (int  i = 1;  i < num;  i++) {
            if (num %  i == 0) {
//                int secondNumber = num/firstNumber;
                sum= sum+i;
            }
        }
        return sum;
    }

    static void main() {
        int num=28;
//        boolean checkPerfect = CheckPerfectNumber(num);
//        if (checkPerfect) {
//            System.out.println("Given Number is a perfect Number");
//        }else {
//            System.out.println("Given Number is not a perfect Number");
//
//        }
        int sum = Check_PerfectNumber(num);
        if (sum == num) {
            System.out.println("Given Number is a perfect Number");

        }else {
            System.out.println("Given Number is not a perfect Number");

        }
    }
}
