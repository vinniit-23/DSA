package BasicMaths;

public class PrimeCheck {
    static boolean PrimeCheck(int num){
for (int i = 2;i*i<=num;i++){
    if (num%i==0){
        return false;
    }
}
        return true;
    }

    static void main() {
        boolean primeCheck = PrimeCheck(89);
        if (primeCheck){
            System.out.println("given is a prime");
        }else{
            System.out.println("given is not a prime");


        }

    }
}
