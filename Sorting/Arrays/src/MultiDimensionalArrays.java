import java.util.Scanner;
import java.util.Arrays;
public class MultiDimensionalArrays {

    public static void main(String[] args){

        /*
        1 2 3
        4 6 6
        7 8 9

         */

//        int[][] arr = new int[3][3];

//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };


        Scanner input = new Scanner(System.in);

        int[][] arr = new int[3][2];
        System.out.println(arr.length);
        for(int row = 0; row < arr.length; row++ ){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = input.nextInt();
            }
        }


//        for(int rows = 0; rows < arr.length; rows++){
//            for(int col = 0; col < arr[rows].length; col++){
//                System.out.print(arr[rows][col] + " ");
//            }
//
//            System.out.println();
//        }

//        for(int row = 0; row < arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));

//        for(int[] a  : arr){
//            System.out.println(Arrays.toString(a));

    }
}
