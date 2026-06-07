import java.util.Arrays;
import java.util.Scanner;

public class ChangeValue {
    public static void main(String[] args){
        int[] arr = {1,2,47,9};
        change(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void change(int[] nums){
        nums[0] = 99;
    }
}
