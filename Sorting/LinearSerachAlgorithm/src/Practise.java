import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Practise {
    public static void main(String[] args){

        // method 1

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter size of the array  :  ");
//        int n = input.nextInt();
//
//        int[] arr = new int[n];
//
//        for(int i = 0; i < n; i++){
//            arr[i] = input.nextInt();
//        }

//        for(int i = 0; i < n; i++){
//            System.out.print(arr[i] +  " ");
//        }


        // Method 2

//        int[] arr = new int[]{1,2,3,4,5};
//
//        for(int num : arr){
//            System.out.print(num  +  " ");
//        }

        // method 3

//        int[] arr = new int[]{1,2,3,4,5};
//        System.out.println(Arrays.toString(arr));

        // 2D Array Method 1

//        Scanner input  = new Scanner(System.in);
//
//
//
//        int[][] arr = new int[3][4];
//
//        for(int rows = 0; rows < arr.length; rows++){
//            for(int col = 0; col < arr[rows].length; col++){
//                arr[rows][col] = input.nextInt();
//            }
//        }
//
//
//        for(int rows = 0; rows < arr.length; rows++){
//            for(int col = 0; col < arr[rows].length; col++){
//                System.out.print(arr[rows][col] + " ");
//            }
//
//            System.out.println();
//        }


        // Method 2

//        int[][] arr = new int[][]{
//                {1,2,3},
//                {4,5,7,9},
//                {2,9,9,0}
//        };

//        for(int i = 0; i < arr.length; i++){
//            System.out.println(Arrays.toString(arr[i]));
//            System.out.println(Arrays.deepToString(arr));
//        }

//        System.out.println(Arrays.deepToString(arr));

//    int[][] arr = new int[][]{
//            {1,2,3},
//            {4,5,7,9},
//            {2,9,9,0}
//    };
//
//    System.out.println(Arrays.deepToString(arr));

        // method 3

//        int[][] arr = new int[][]{
//                {1,2,3},
//                {7,8,9,6},
//                {2,3,4,6}
//        };
//
//        for(int[] num : arr){
//            System.out.println(Arrays.toString(num));
//        }


        // METHOD 1 ARRAYLIST

//        Scanner input = new Scanner(System.in);
//
//        ArrayList<Integer> list = new ArrayList<>();

        // INPUT 5 ELEMENTS
//        for(int i = 0; i < 5; i++){
//            list.add(input.nextInt());
//        }

//        System.out.println(list);

        // OUTPUT USING LOOP
//        for(int num : list){
//            System.out.print(num + " ");
//        }




        //2D ArrayList

//        Scanner input = new Scanner(System.in);
//
//        ArrayList<ArrayList<Integer>> list = new  ArrayList<>();

        // create rows
//        for(int i = 0; i < 3; i++){
//            list.add(new ArrayList<>());
//        }

        // TAKING INPUT
//        for(int i = 0; i < 3; i++){
//            for(int j = 0; j < 3; j++){
//                list.get(i).add(input.nextInt());
//            }
//        }

//        //OUTPUT
//        for(int i = 0; i < 3; i++){
//            System.out.println(list.get(i));
//        }


        // REVERSING A ARRAY

        int[] arr = new int[]{1,2,3,4,5};

        reverse(arr);
        System.out.println(Arrays.toString(arr));



    }

    static void swap(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
