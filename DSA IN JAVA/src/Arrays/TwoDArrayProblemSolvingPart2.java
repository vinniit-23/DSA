package Arrays;

import java.util.ArrayList;
import java.util.List;

public class TwoDArrayProblemSolvingPart2 {

    static int[][] rotateImage(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

//      Matrix Transpose
        for (int row = 0; row < m; row++) {
            for (int col = row+1; col < n; col++) {
                int temp = arr[row][col];
//                System.out.println("temp "+temp);
                arr[row][col] = arr[col][row];
//                System.out.println("arr[col][row] "+arr[col][row]);
                arr[col][row] = temp;
//                System.out.println("arr[row][col] "+arr[row][col]);
//                System.out.println("#####################################");
//                System.out.println("row "+row+" col "+col+" "+arr[row][col]);
            }
        }



//        Reverse the coloumn
        for (int row = 0; row < m; row++) {
            int j = n - 1;
            int k = 0;
            while (k < j) {
                int temp = arr[row][k];
                arr[row][k] = arr[row][j];
                arr[row][j] = temp;
                k++;
                j--;
            }
        }


        return arr;
    }


    static List<Integer>  spiralPrint(int [][] arr){
        int m = arr.length;
        int n = arr[0].length;
        List<Integer> res = new ArrayList<>();

        int startrow =0;
        int endrow = m-1;
        int startcol =0;
        int endcol = n-1;

        while (startrow<=endrow && startcol<=endcol){

            for (int col = startcol; col <= endcol; col++) {
                int val = arr[startrow][col];
                res.add(val);
            }
            startrow++;

            for (int row = startrow; row <= endrow ; row++) {
                int val = arr[row][endcol];
                res.add(val);
            }
            endcol--;

            if (startrow<=endrow){
                for (int col = endcol; col >= startcol; col--) {
                    int val = arr[endrow][col];
                    res.add(val);
                }
                endrow--;
            }

            if (startcol<=endcol){
                for (int row = endrow; row >= startrow; row--) {
                    int val = arr[row][startcol];
                    res.add(val);
                }
                startcol++;
            }



        }






        return  res;
    }




    static void main() {
        int[][] matrix1 = {
                {1, 2, 3, 10},
                {4, 5, 6, 11},
                {7, 8, 9, 12},
//                {13,14,15,16},
                {17,18,19,20}
        };

        int [][] rotateMatrix1 = rotateImage(matrix1);
//        List<Integer> spiralprint = spiralPrint(matrix1);
//        System.out.println(spiralprint);

        for (int row = 0; row <rotateMatrix1.length ; row++) {
            int n = rotateMatrix1[row].length;
            for (int col = 0; col < n; col++) {
                int val = rotateMatrix1[row][col];
                System.out.print(val+" ");
            }
            System.out.println();
        }

    }
}
