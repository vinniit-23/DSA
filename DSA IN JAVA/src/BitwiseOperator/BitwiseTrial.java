package BitwiseOperator;

public class BitwiseTrial {
    static void main() {
        int a=5,b=6;
        System.out.println("And (&) Operator: "+(a&b));
        System.out.println("OR (|) Operator: "+(a|b));
        System.out.println("XOR (^) Operator: "+(a^b));
        System.out.println("NOT (~) Operator: "+(~a));
        System.out.println("Right Shift (>>) Operator: "+(a>>1));
        System.out.println("Left Shift (<<) Operator: "+(a<<1));
        System.out.println("Unsigned Right Shift (>>>) Operator: "+(a>>>1));
    }
}
