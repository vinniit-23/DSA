package BasicMaths;

public class LCM {
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
        int a,b;
        a=12;b=18;
        int GCD = FindGCD(a,b);
        int LCM = a*b/GCD;
        System.out.println("LCM is : "+LCM);
    }
}
