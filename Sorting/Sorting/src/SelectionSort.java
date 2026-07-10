// IN THSI METHOD WE ARE PICKING LARGEST ELEMENT AND GIVING HIM LAST INDEX

//import java.util.Arrays;
//public class SelectionSort {
//
//    public static void main(String[]  args){
//
//        int[] arr = {5,3,4,1};
//
//        selectionSort(arr);
//
//        for(int num : arr){
//            System.out.print(num + " ");
//        }
//
////        System.out.println(Arrays.toString(arr));
//
//    }
//
//    static void selectionSort(int[] arr){
//
//        for(int  i = 0; i < arr.length - 1; i++){
//
//            int last = arr.length - i - 1;
//            int maxIndex = getIndex(arr,0,last);
//
//            swap(arr,maxIndex,last);
//        }
//    }
//
//    static int getIndex(int[] arr, int start, int end){
//
//        int max = start;
//
//        for(int  i  = start;  i <= end; i++){
//            if(arr[i] > arr[max]){
//                max = i;
//            }
//        }
//        return max;
//    }
//
//    static void swap(int[] arr, int first, int second){
//        int temp = arr[first];
//
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//
//
//


}