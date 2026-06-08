package BitwiseOperator;

public class ArrayMissingElem {
    static void main() {
        int [] arr = {1,2,3,5,6,7};
//        int [] newarr;
//        newarr = new int[arr.length+1];
        int xor=0;
        int xor1=0;
        int xor2=0;
 //        for (int i=0;i<= arr.length;i++){
//            newarr[i]= (i+1);
     //        System.out.println(newarr[i]);
//        }
        for(int j=0;j < arr.length;j++){
            xor1^=arr[j];

        }
        for(int j=0;j <= arr.length;j++){
            xor2^=j+1;

        }
//        for(int j:newarr){
//            xor2^=j;
//        }
        xor=xor1^xor2;
        System.out.println("Missing element is: "+xor);
    }
}
