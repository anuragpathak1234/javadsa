
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
public class LinearSearchQuestion {

    public static void main(String[] args){

        int[] arr = new int[]{10,20,30,40,50};
        int target = 40;

        int ans  = LinearSearch(arr,target);
        System.out.println(ans);
    }

    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run for loop

        for (int index = 0; index <= arr.length; index++) {
            // check for element at every index if it is = target

            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        // this line will execute if none of them return statements above executed;
        // hence the target not found
        return -1;
    }

}
