package BasicMaths;

public class PrintPrimeNumber {
    static boolean CheckPrime(int num){
        for (int i = 2; i*i <=num ; i++) {
            if (num%i==0){
        return false;
            }
        }
        return true;
    }

    static void main() {
        int n = 100;
        for (int i = 2; i <=n ; i++) {
            boolean primeChecked = CheckPrime(i);
            if (primeChecked){
                System.out.println("Prime Number: "+i);
            }
        }
    }
 }
