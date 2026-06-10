package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ArrayProblemBeginners {



    static int ArrayAverage(int[] arr){
        int sum=0;
        int n= arr.length;
        for(int i:arr){
            sum+=i;
        }
        return  sum/n;
    }

    static int[] MultipleBy10(int[] arr){

        int n= arr.length;
        int newArr []= new int[n];
        for (int i = 0; i <n ; i++) {
            newArr[i] =10*arr[i];
        }
        return  newArr;
    }

    static int MaxElement(int[] arr){
        int n= arr.length;
        int max=arr[0];
        for (int i = 0; i <n ; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

static boolean LinearSearch(int [] arr,int target){
        for (int i:arr){
            if (target==i) return true;
        }
        return false;
}

static int [] SumOfPositiveAndNegative(int[] arr){
        int PositiveSum=0;
        int NegativeSum=0;
        int n= arr.length;
    for (int i = 0; i <n ; i++) {
        if (arr[i]<0){
            NegativeSum +=arr[i];
        }else {
            PositiveSum +=arr[i];
        }
    }
//    System.out.println(PositiveSum);
//    System.out.println(NegativeSum);
    return new int[]{PositiveSum,NegativeSum};
}



static int [] NumberOfZeroAndOnes(int[] arr){
        int n = arr.length;
         int Count0 =0;
        int Count1=0;
    for (int i = 0; i <n ; i++) {
        if (arr[i]==1){
            Count1++;
        }else {
            Count0++;
        }

    }
    int [] newArr ={Count0,Count1};
        return newArr;
}











static int UnsortElement(int [] arr){
        int n= arr.length;
        int unSortedElem= 0;

        for (int i =0;i<n;i++){
            if (arr[i]>arr[i+1]){
                return arr[i];
            }
        }


        return -1;
}





//    Homeworks


//    Still have problem
    static int [] SwapElementArray(int arr[]){
        int n = arr.length;
        int[] newArr = new int[n];
        for(int i=0;i<n;i+=2)//noinspection SuspiciousIndentAfterControlStatement
        {
            if (i+1== arr.length) {
                break;
            }
                newArr[i] = arr[i + 1];
                newArr[i + 1] = arr[i];
        }
        return newArr;
    }



    static int [] ArrayIntersection(int [] arr1,int[] arr2){
        int [] newArr = new int[arr1.length];
         int count =0;
        for (int i = 0; i < arr1.length ; i++) {
            if (arr1[i]==arr2[i]){
                newArr[count]=arr1[i];
                count++;
            }
        }

        return newArr;
    }


    static void arrayIntersection(int [] arr1,int[] arr2){
        Set<Integer> Intersection = new HashSet<>();
         for (int i = 0; i < arr1.length ; i++) {
             int a=arr1[i];
             int b=arr2[i];
            if (a==b){
                System.out.println(a);
                Intersection.add(a);
            }
        }

         for(int j:Intersection){
             System.out.println(j);
         }

     }


    static int [] SwapAlternateElem(int [] arr){
        int n = arr.length;
        int [] newArr = new int [n];
        int counti=0;
        int countn=1;
        for (int i = 0; i<n;i++){
            if((i&1)==0){
                newArr[i]=arr[i-counti];
                counti++;
            }else{
                newArr[i]=arr[n-countn];
                countn++;
            }
        }
        return  newArr;
    }


static void main() {
    int [] arr={1,2,3,4,5,6};
//    System.out.println(UnsortElement(arr));
//int [] newSwapElemArr = SwapElementArray(arr);
// for(int j:newSwapElemArr){
//     System.out.println(j);
// }

//    int []  swapAlternateElem = SwapAlternateElem(arr);
//    for(int i:swapAlternateElem){
//        System.out.println(i);
//    }

//    int [] newArr=SwapElementArray(arr);
//    for (int i = 0; i < newArr.length; i++) {
//        System.out.println(newArr[i]);
//    }
//    int [] newArr=MultipleBy10(arr);
//    for (int i = 0; i < newArr.length; i++) {
//        System.out.println(newArr[i]);
//    }

    int [] SumArr={-1,2,-3,4,-5,6};
 arrayIntersection(arr,SumArr);
//int[] SumNewArr= SumOfPositiveAndNegative(SumArr);
//    System.out.println("Sum of positive element: "+SumNewArr[0]+" Sum Of Negative Element: "+SumNewArr[1]);
//
//
//    int[] Intersection = ArrayIntersection(arr,SumArr);
//    for (int i = 0; i < Intersection.length; i++) {
//        System.out.println(Intersection[i]);
//    }


//    System.out.println("Average of Array: "+ArrayAverage(arr));
//    System.out.println("Maximum Element of Array: "+MaxElement(arr));
//    System.out.println("Is Element present : "+LinearSearch(arr,4));



//    int [] ZeroOneArr = {1,1,1,0,1,0,0,0,1};
//    int [] newZeroOneArr=NumberOfZeroAndOnes(ZeroOneArr);
//    System.out.println("Number Of Zeroes: "+newZeroOneArr[0]+" Number Of Zeroes: "+newZeroOneArr[1]);

}
}
