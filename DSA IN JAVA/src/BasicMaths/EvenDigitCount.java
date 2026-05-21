package BasicMaths;

public class EvenDigitCount {

    static void Count_Even(int num){
        int count=0;
         while (num!=0) {
        int digit = num%10;
        if (digit%2==0){
            System.out.println("Even number "+digit);
            count++;
        }
        num=num/10;
         }
            System.out.println("total Even Count "+count);
     }

    static void main() {
        int num =  9836448;
        Count_Even(num);

    }
}
