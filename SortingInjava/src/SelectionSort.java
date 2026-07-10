import java.util.Arrays;

import static java.util.Collections.swap;

public class SelectionSort {
    public static void main(String[] args){

        int[] arr = {5,3,4,1};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){

//            int last = arr.length - i - 1;
            int minIndex = getminIndex(arr,i, arr.length  - 1);

            swap(arr,minIndex,i);
        }
    }

    static int getminIndex(int[]arr,int start, int end){

        int min = start;
        for(int   i = start; i <= end; i++){
            if(arr[i] < arr[min]){
                min = i;
            }
        }
        return min;
    }

    static void swap(int[] arr, int smallest, int length){
        int temp = arr[smallest];
        arr[smallest] = arr[length];
        arr[length] = temp;
    }
}
