import java.util.Scanner;
import java.util.Arrays;

public class SerachingMinval {

    public static void main(String[] arrgs){
        int[] arr = new int[]{10,68,390,-37,37};

        System.out.println(MinVal(arr));
    }

    static int MinVal(int[] arr){

        if(arr.length == 0){
            return -1;
        }

        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
