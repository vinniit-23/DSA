package BasicMaths;

public class Factorial {
    static void main() {
        int num = 9;
        int fact = 1;
        for (int i=1;i<=num;i++){
            fact= fact*i;
        }
        System.out.println("Factorial is : "+fact);
    }
}
