package Arrays;

public class KadaneAlgorithm {

    static int subArrayLargestSum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += arr[j];
                maxi = Math.max(maxi, sum);
//                System.out.println("i "+i);
//                System.out.println("j "+j);
//                System.out.println("Sum "+sum);
//                System.out.println("Maxi "+maxi);
            }
            sum = 0;
        }

        return maxi;

//        time Complexity = O(n^2)
//        Space Complexity = O(1)
    }


    static int subArrayLargestSumOptimal(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            maxi = Math.max(sum, maxi);
            if (sum < 0) sum = 0;
        }

        return maxi;
        //        time Complexity = O(n)
        //        Space Complexity = O(1)
    }


    static void main() {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = subArrayLargestSumOptimal(arr);
        System.out.println(maxSum);
    }
}
