package SortingAndSearching;

public class BinarySearch {

    static boolean binarySearch(int [] arr,int target){
        int start=0;
        int end = arr.length-1;
        int mid = start+(end-start)/2;

        while (start<=end){
            if (arr[mid]==target) {
                return true;
            }else if(arr[mid]>target){
                end=mid-1;
            }else {
                start=mid+1;
            }
                mid = start+(end-start)/2;
        }

        return false;
    }


    static int lowerBound(int[] arr,int target){
        int n= arr.length;
        int LowerBound = n;
        int start=0;
        int end = n-1;
        int mid = start+(end-start)/2;
        while (start<=end){
            if(arr[mid]>=target){
                LowerBound=mid;
                end=mid-1;
            }else {
                start=mid+1;
            }
            mid = start+(end-start)/2;
        }

        return LowerBound;
    }



    static int upperBound(int[] arr,int target){
        int n= arr.length;
        int UpperBound = n;
        int start=0;
        int end = n-1;
        int mid = start+(end-start)/2;
        while (start<=end){
            if(arr[mid]>target){
                UpperBound=mid;
                end=mid-1;
            }else {
                start=mid+1;
            }
            mid = start+(end-start)/2;
        }

        return UpperBound;
    }

    static int CountReaptingElem(int arr [],int target){
        int lowerbound = lowerBound(arr,target);
        int upperbound = upperBound(arr,target);
        int Count = upperbound-lowerbound;
        return Count;
    }

    static void main() {
        int [] arr = {1,2,2,2,2,2,2,2,3,4,5,6,7};
        int target =2;
        System.out.println(CountReaptingElem(arr,target));

    }
}
