package Arrays;

import javax.xml.transform.Source;
import java.util.HashMap;

public class ArrayManipulationProblem {
    static void ReverseArray(int [] arr){
        int n= arr.length;
        int i=0;
        int j=n-1;
        while (i<=j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k:arr){
            System.out.println(k);
        }
    }

    static void shiftby1(int[] arr){
        int n= arr.length;
        int temp = arr[n-1];
        for (int i = n-1; i >=0 ; i--) {
            if (i==0)break;
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        for(int k:arr){
            System.out.println(k);
        }

    }

 static void PrintExtremeAlternate(int [] arr){
        int n= arr.length;
        int i=0;
        int j=n-1;
        while (i<=j) {
            System.out.println(arr[i]);
            i++;
            System.out.println(arr[j]);
            j--;
        }
 }


 static int ModeOfArray(int[] arr){
        int n = arr.length;
        int Mode =0;
     HashMap<Integer,Integer> freq= new HashMap<>();

     for(int i:arr){
         freq.put(i, freq.getOrDefault(i,0)+1);
     }
     for(int i: freq.keySet()){
         if (Mode< freq.get(i)){
             Mode= freq.get(i);
         }
     }

        return Mode;
 }


    static int [] HighestAndLowestFreq(int[] arr){
        int n = arr.length;
        int highestFreq =Integer.MIN_VALUE;
        int lowestFreq =Integer.MAX_VALUE;
        HashMap<Integer,Integer> freq= new HashMap<>();

        for(int i:arr){
            freq.put(i, freq.getOrDefault(i,0)+1);
        }
        for(int i: freq.keySet()){
            if (highestFreq< freq.get(i)){
                highestFreq= freq.get(i);
            } else if (lowestFreq>freq.get(i)) {
                lowestFreq = freq.get(i);
            }

        }

        int [] newArr={highestFreq,lowestFreq};

        return newArr;
    }



    static void main() {
        int [] arr={1,2,3,4,5,5,6,6,6,6,6,6,6};
        int [] newArr =HighestAndLowestFreq(arr);
             System.out.println("HigestFreq "+newArr[0]);
             System.out.println("LowestFre "+newArr[1]);
 //        int mode = ModeOfArray(arr);
//        System.out.println(mode);
//        ReverseArray(arr);
//        shiftby1(arr);
//        PrintExtremeAlternate(arr);

    }
}
