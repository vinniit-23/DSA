package Arrays;

public class ArrayProblemSolvingPart3 {
    static int [] sortArray0s1s(int [] arr){
        int n= arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]==1&&arr[j]==0){
                arr[i]=0;
                arr[j]=1;
            }
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
        }
        return arr;
    }

    static int missingElem(int[] arr){
        int n= arr.length;
        int XorAns=0;
        for (int i:arr){
            XorAns^=i;
        }
        for (int i = 0; i <=n ; i++) {
            XorAns^=i;
        }

        return XorAns;
    }


    static int uniqueElement(int[] arr){
         int XorAns=0;
        for(int i:arr){
            XorAns^=i;
        }
        return XorAns;
    }

    static void main() {
//        int arr[]={1,1,0,0,0,1,0};
//       int [] sortedArray0s1s= sortArray0s1s(arr);
//       for(int i:sortedArray0s1s){
//           System.out.print(i+" ");
//       }


//       int [] arr1={0,1,2,3,5,6};
//        System.out.println(missingElem(arr1));


       int [] arr2={1,1,2,2,3,4,4,3,5,5,6};
        System.out.println(uniqueElement(arr2));



    }
}
