package Arrays;

import java.util.ArrayList;
import java.util.List;

public class TwoDArrayProblemSolvingPart1 {

static List<Integer> sumOfRow(int [][] nums){
    List<Integer> res = new ArrayList<>();
    int m= nums.length;

    for (int row = 0; row <m ; row++) {
        int n = nums[row].length;
        int sum =0;
        for (int col = 0; col <n ; col++) {
            sum+=nums[row][col];
        }
            res.add(sum);
    }

    return res;
}



    static List<Integer> sumOfColumn(int [][] nums){
        List<Integer> res = new ArrayList<>();
        int m= nums.length;
        int n = nums[0].length;

        for (int col = 0; col <n ; col++) {
            int sum =0;
//            System.out.println("value of i "+i);
            for (int row = 0; row <m ; row++) {
                sum+=nums[row][col];
//                System.out.println("value of j "+j);
//                System.out.println("value at i and j in nums "+nums[j][i]);
//                System.out.println("Sum at inner loop "+sum);
//            System.out.println("******************************");
            }
                res.add(sum);
//            System.out.println("Sum of outer loop "+sum);
//            System.out.println("******************************");
        }

        return res;
    }


    static List<Integer> wavePrintMatix(int [][] nums){
        List<Integer> res = new ArrayList<>();
        int m= nums.length;
        int n = nums[0].length;

        for (int col = 0; col <n ; col++) {
            if ((col&1)==0){
                for (int row = 0; row <m ; row++) {
                    res.add(nums[row][col]);
                }
            }else {
                for (int row = m-1; row >-1; row--) {
                    res.add(nums[row][col]);

                }
            }
        }

        return res;
    }




    static int [][] transposeOfMatrix(int [][] nums){
         int m= nums.length;
        int n = nums[0].length;
        int [][] res = new int[n][m];

        for (int row = 0; row <m ; row++) {
             for (int col = 0; col <n ; col++) {
                 res[col][row]=nums[row][col];
            }
        }

        return  res;
    }







    static void main() {

//    Sum Of Row
//    int [][] mat1 = {
//            {1,4,7},
//            {2,5,8},
//            {3,6,9},
//    };
//    List<Integer> rowSum = sumOfRow(mat1);
//        System.out.println(rowSum);


//  Sum Of Column
//    int [][] mat2 = {
//            {1,2,3},
//            {4,5,6},
//            {7,8,9},
//    };
//    List<Integer> colSum = sumOfColumn(mat2);
//        System.out.println(colSum);




//        Wave Print of matrix
//    int [][] mat3 = {
//            {1,2,3},
//            {4,5,6},
//            {7,8,9},
//    };
//    List<Integer> wavePrint = wavePrintMatix(mat3);
//        System.out.println(wavePrint);



//        Transpose Of Matric
        int [][] mat4 = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        int [][] TransposeMatrix = transposeOfMatrix(mat4);
        int m= TransposeMatrix.length;
        int n= TransposeMatrix[0].length;
        for (int row = 0; row <m ; row++) {
            for (int col = 0; col <n ; col++) {
                System.out.print(TransposeMatrix[row][col]+" ");
            }
            System.out.println();
        }

    }
}
