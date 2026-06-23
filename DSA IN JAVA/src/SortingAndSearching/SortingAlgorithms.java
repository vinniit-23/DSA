package SortingAndSearching;

public class SortingAlgorithms {
    static void bubbleSort(int [] arr){
        int n= arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j <n ; j++) {
                if (arr[i]>arr[j]){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
    }

    static void selectionSort(int[] arr){
        int n= arr.length;
        for (int i = 0; i < n ; i++) {
            int minIndex = i;
            for (int j = i+1; j <n ; j++) {
                if (arr[minIndex]>arr[j]) minIndex=j;
            }
            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }

    static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i <n ; i++) {
            int currentVal = arr[i];
            int prev = i-1;

            while (prev>=0 && currentVal<arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=currentVal;
        }
    }



    static void main() {
        int arr[]={1,3,4,6,2,9,10};
//        bubbleSort(arr);
//        selectionSort(arr);
        insertionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
