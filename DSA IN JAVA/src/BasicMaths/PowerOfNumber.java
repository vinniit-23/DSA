package BasicMaths;

public class PowerOfNumber {
    static void main() {
        int number = 2;
        int power = 5;
        int ans = 1;
        for (int i = 0; i < power; i++) {
            ans=ans*number;
        }
        System.out.println("power of givn number is : "+ans);
    }
}
