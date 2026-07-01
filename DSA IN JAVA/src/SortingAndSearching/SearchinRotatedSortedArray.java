package SortingAndSearching;

public class SearchinRotatedSortedArray {
    static int pivotIndex(int[] nums){
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int ans=-1;
        if(nums[0]<nums[n-1]) {
            return ans;
        }

        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]<=nums[n-1]){
                end = mid-1;
            }else{
                ans=mid;
                start = mid+1;
            }
        }
        return ans;
    }
    static int pivotIndex1(int[] nums){
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int ans=-1;
        if(nums[0]<nums[n-1]) {
            return ans;
        }

        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                ans=mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
//        Getting this error In this code
//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
//	at SortingAndSearching.SearchinRotatedSortedArray.pivotIndex1(SearchinRotatedSortedArray.java:35)
//	at SortingAndSearching.SearchinRotatedSortedArray.main(SearchinRotatedSortedArray.java:96)
//
//Process finished with exit code 1
    }

    static int binarySearch(int[] nums,int target,int start,int end){
//        int n= nums.length;

        int ans=-1;

        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                break;
            }else if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }
        }

        return ans;
    }

    static int search(int[] nums, int target) {
        int n = nums.length;
        int PivotIndex = pivotIndex(nums);
        int l1Start=0;
        int l1End= PivotIndex;
        int l2Start = PivotIndex+1;
        int l2End = n-1;
        int ans =-1;

        if(PivotIndex==-1){
            ans=binarySearch(nums,target,l1Start,l2End);
            return ans;
        }else{
            if(target>=nums[l1Start] && target<=nums[l1End]){
                ans=binarySearch(nums,target,l1Start,l1End);
                return ans;
            } else if(target>=nums[l2Start] && target<=nums[l2End]){
                ans=binarySearch(nums,target,l2Start,l2End);
                return ans;
            }

        }

        return ans;
    }

    static void main() {
int [] nums = {4,5,6,7,8,0,1,2,};
        int n= nums.length;

        System.out.println(pivotIndex1(nums));
//        System.out.println(binarySearch(nums,0,0,n-1));
//        System.out.println(search(nums,0));
    }
}
