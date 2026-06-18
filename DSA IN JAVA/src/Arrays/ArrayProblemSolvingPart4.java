package Arrays;

import java.awt.*;
import java.util.*;
import java.util.List;

public class ArrayProblemSolvingPart4 {

    static int [] TwoSum(int [] arr,int target){
        int [] newArr = new int[2];
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j <n ; j++) {
                if (arr[i]+arr[j]==target){
                    newArr[0]=i;
                    newArr[1]=j;
                }
            }

        }

        return newArr;
    }


    static List<List> ThreeSum(int [] arr){
        Set<List<Integer>> res = new HashSet<>();
         int n = arr.length;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j <n-1 ; j++) {
                for (int k = j+1; k <n ; k++) {
                if (arr[i]+arr[j]+arr[k]==0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    Collections.sort(temp);
                    res.add(temp);

                }
                }
            }

        }

        return new ArrayList<>(res);
    }


    static List<List> ThreeSumBetterApproach(int [] arr){
        int n = arr.length;
        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i <n-2 ; i++) {
            HashSet <Integer> st = new HashSet<>();
            for (int j = i+1; j <n ; j++) {
                int third = -(arr[i]+arr[j]);

                if (st.contains(third)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(third);
                    Collections.sort(temp);
                    res.add(temp);
                }
                st.add(arr[j]);
            }

        }

        return new ArrayList<>(res);
    }

    static List<List> ThreeSumOptimalApproach(int [] arr){
        int n = arr.length;
        Arrays.sort(arr);
        List<List> res = new ArrayList<>();


         for (int i = 0; i <n-2 ; i++) {
             if(i>0 && arr[i]==arr[i-1]) continue;
             int j=i+1;
             int k=n-1;
             while (j<k){
               if (arr[i]+arr[j]+arr[k]<0){
                   j++;
               } else if (arr[i]+arr[j]+arr[k]>0) {
                   k--;
               } else if (arr[i]+arr[j]+arr[k]==0) {
                   List<Integer> temp = new ArrayList<>();
                   temp.add(arr[i]);
                   temp.add(arr[j]);
                   temp.add(arr[k]);
                    res.add(temp);
                    j++;
                    k--;
                   while(j<k && arr[j]==arr[j-1]){j++;}
                   while(j<k && arr[k]==arr[k+1]){ k--;}
               }

             }

        }

        return res;
    }



   static int removeDuplicates(int [] arr){
        int n = arr.length;
        int i =0;
        int j=1;
        while (j<n){
            if(arr[i]==arr[j]){
                j++;
            }else{
                arr[++i]=arr[j++];
            }
        }
        return  i+1;
   }


    static int findFirstRepeatingElem(int[] arr){
        int n= arr.length;
        int repeatingElem =0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int i:arr){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }

        for(int i: freq.keySet()){
            if(freq.get(i)>1){
                repeatingElem =i;
                break;
            }
        }


        return repeatingElem;
    }



    static  int pivotIndex(int arr[]){
        int n= arr.length;
        int pivotIndex=0;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        leftSum[0]=arr[0];
        rightSum[n-1]=arr[n-1];

        for (int i = 1; i <n ; i++) {
            leftSum[i]=leftSum[i-1]+arr[i];
        }

        for (int j = n-2; j>-1 ; j--) {
             rightSum[j]=rightSum[j+1]+arr[j];
        }

        for (int i = 0; i < n; i++) {
            if (leftSum[i]==rightSum[i]){
                pivotIndex = i;
            }
        }



        return pivotIndex;
    }


    static  List<Integer> missingElemFromArrayOfDupicates(int [] arr){
        List<Integer> res = new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            int val=Math.abs(arr[i]);
            int position = val-1;
            arr[position]=-arr[position];
            if (arr[position]<0) continue;
        }

        for(int i=0; i< arr.length;i++){
            if (arr[i]>0) res.add(i+1);
        }



        return  res;
    }




    static void main() {

//        Two SUM
//        int [] arr ={1,2,3,4,5};
//        int target =9;
//        int [] newArr = TwoSum(arr,target);
//            System.out.println("indices of two number which sum equals to target");
//        for(int i:newArr){
//            System.out.println(i);
//        }



//        Three Sum
        int [] arr ={0,-1,1,2,-2 };
         List <List> newArr = ThreeSumOptimalApproach(arr);
            System.out.println("indices of two number which sum equals to target");
        newArr.forEach(System.out::println);


//        Remove Duplicates
//        int [] arr= {1,2,2,3,4,4,4,5,6,7,9};
//        int n=removeDuplicates(arr);
//        System.out.println(n);


//        findFirstRepeatingElem
//        int [] arr= {1,2,3,4,4,4,5,6,7,9};
//        int n=findFirstRepeatingElem(arr);
//        System.out.println(n);


//        Find Pivot Index
//        int [] arr = {1,7,3,6,5,6};
//        int n = pivotIndex(arr);
//        System.out.println(n);


//        Find Missing element from array of duplicates
//        int [] arr ={1,3,3,3,5};
//         List <Integer> newArr = missingElemFromArrayOfDupicates(arr);
//         newArr.forEach(System.out::println);
    }
}
