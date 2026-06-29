package SortingAndSearching;

public class PeakIndexOfMontainArray {
    static int PeakIndexOfMonatainArray(int [] arr){
        int n= arr.length;
        int start =0;
        int end =n-1;
        int peakIndex=-1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]<arr[mid+1]){
                start=mid+1;
            }else {
                peakIndex=mid;
                end=mid-1;
            }
        }
        return peakIndex;
    }

    static void main() {
        int arr[]={10,20,30,40,60,70,50,35};
        System.out.println(PeakIndexOfMonatainArray(arr));
    }
}
