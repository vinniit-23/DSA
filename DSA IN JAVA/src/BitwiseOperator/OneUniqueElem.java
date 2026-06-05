package BitwiseOperator;

public class OneUniqueElem {
    static void main() {
        int[] arr = {10, 24, 17, 10, 17, 13, 24};
        int xorans=0;
//        int []ans={};
        for (int j : arr) {
            xorans = j ^ xorans;
        }
        System.out.println(xorans);
    }
}
