package Arrays;

public class ArrayProblemSolvingPart3 {
    static int[] sortArray0s1s(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }
        return arr;
    }

    static int missingElem(int[] arr) {
        int n = arr.length;
        int XorAns = 0;
        for (int i : arr) {
            XorAns ^= i;
        }
        for (int i = 0; i <= n; i++) {
            XorAns ^= i;
        }

        return XorAns;
    }


    static int uniqueElement(int[] arr) {
        int XorAns = 0;
        for (int i : arr) {
            XorAns ^= i;
        }
        return XorAns;
    }

    static int[] DutchNationalFlag_CountApproach(int[] arr) {
        int n = arr.length;
        int Count0 = 0;
        int Count1 = 0;
        int Count2 = 0;

        for (int i : arr) {
            if (i == 0) Count0++;
            if (i == 1) Count1++;
            else Count2++;
        }


        for (int i = 0; i < Count0; i++) {
            arr[i] = 0;
        }

        for (int i = Count0; i < Count1; i++) {
            arr[i] = 1;
        }

        for (int i = Count1; i < n; i++) {
            arr[i] = 2;
        }


        return arr;
    }


    static int[] DutchNationalFlag_ThreePointerApproach(int[] arr) {
        int n = arr.length;
        int i = 0;
        int mid = 0;
        int j = n - 1;

        while (mid <= j) {

            if (arr[mid] == 0) {
                int temp = arr[i];
                arr[i] = arr[mid];
                arr[mid] = temp;
                mid++;
                i++;

            } else if (arr[mid] == 1) {
                mid++;

            } else {
                int temp = arr[j];
                arr[j] = arr[mid];
                arr[mid] = temp;
                j--;
            }


        }

        return arr;
    }


    static void main() {
//        int arr[]={1,1,0,0,0,1,0};
//       int [] sortedArray0s1s= sortArray0s1s(arr);
//       for(int i:sortedArray0s1s){
//           System.out.print(i+" ");
//       }


//       int [] arr1={0,1,2,3,5,6};
//        System.out.println(missingElem(arr1));


//       int [] arr2={1,1,2,2,3,4,4,3,5,5,6};
//        System.out.println(uniqueElement(arr2));

//
//        int [] arr3={1,2,0,0,1,2,0,1,2,1,1};
//        int[] newArr3= DutchNationalFlag_CountApproach(arr3);
//        for(int i:newArr3){
//            System.out.print(i+" ");
//        }


        int[] arr4 = {1, 2, 0, 0, 1, 2, 0, 1, 1, 1};
        int[] newArr4 = DutchNationalFlag_ThreePointerApproach(arr4);
        for (int i : newArr4) {
            System.out.print(i + " ");
        }


    }
}
