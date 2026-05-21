package BasicMaths;

public class GCD {
    static int FindGCD(int a,int b){
        int GCD = 0;
        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        GCD=a;
        return GCD;
    }

    static void main() {
        int GCD = FindGCD(81,9);
        System.out.println("GCD is : "+GCD);
    }
}
