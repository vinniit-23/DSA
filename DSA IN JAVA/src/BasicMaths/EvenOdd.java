package BasicMaths;

public class EvenOdd {
    static void CheckEvenOdd(int num){
        if (num%2==0){
            System.out.println("Given Number is even");
        }else {
            System.out.println("Given Number is odd");

        }
    }

    static void main() {
        CheckEvenOdd(89);
    }
}
