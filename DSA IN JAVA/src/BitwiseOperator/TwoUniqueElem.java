package BitwiseOperator;

public class TwoUniqueElem {
    static void main() {
        int[] arr = {10, 24, 17, 10, 17, 13, 24,9};
        int xorans=0;
//        int []ans={};
        for (int j : arr) {
            xorans = j ^ xorans;
        }
//        System.out.println(xorans);
    int setBit = xorans & (-xorans);
int num1=0;
int num2=0;

        for (int j : arr) {
if ((setBit&j)==0){
    num1^=j;
}else {
    num2^=j;
}
        }

        System.out.println(num1);
        System.out.println(num2);





    }


}
