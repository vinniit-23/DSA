package Arrays;

public class ArrayProblemBeginners {
//    Homeworks

    static int [] SwapElementArray(int arr[]){
        int n = arr.length;
        int[] newArr = new int[n];
        for(int i=0;i<n;i++){
            if (i+1<n) {
                int num1 = arr[i];
                int temp = num1;
                int num2 = arr[i + 1];
 newArr[i]=num2;
 newArr[i+1]=num1;
            }
        }
        return newArr;
    }


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


static int [] ArrayIntersection(int [] arr1,int[] arr2){
        int [] newArr = new int[arr1.length];

    for (int i = 0; i < arr1.length ; i++) {
        if (arr1[i]==arr2[i]){
            newArr[i]=arr1[i];
        }
    }

        return newArr;
}




static void main() {
    int [] arr={1,2,3,4,5,6};
//    int [] newArr=SwapElementArray(arr);
//    for (int i = 0; i < newArr.length; i++) {
//        System.out.println(newArr[i]);
//    }
//    int [] newArr=MultipleBy10(arr);
//    for (int i = 0; i < newArr.length; i++) {
//        System.out.println(newArr[i]);
//    }

    int [] SumArr={-1,2,-3,4,-5,6};
int[] SumNewArr= SumOfPositiveAndNegative(SumArr);
    System.out.println("Sum of positive element: "+SumNewArr[0]+" Sum Of Negative Element: "+SumNewArr[1]);


    int[] Intersection = ArrayIntersection(arr,SumArr);
    for (int i = 0; i < Intersection.length; i++) {
        System.out.println(Intersection[i]);
    }


//    System.out.println("Average of Array: "+ArrayAverage(arr));
//    System.out.println("Maximum Element of Array: "+MaxElement(arr));
//    System.out.println("Is Element present : "+LinearSearch(arr,4));



}
}
