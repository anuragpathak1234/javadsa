import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args){

        int[] arr  = {3,2,1,4,5};

        bubblesort(arr);

        System.out.println(Arrays.toString((arr)));
        System.out.println(arr.length);
    }

    static void bubblesort(int[] arr){

        boolean swapped;
        for(int i = 0; i < arr.length-1; i++){
            swapped =  false;
            for(int j = 1; j < arr.length-i-1; j++){

                if(arr[j] < arr[j - 1]){

                    int temp = arr[j];
                    arr[j] =  arr[j - 1];
                    arr[j - 1] = temp;

                    swapped = true;
                }
            }

            if(!swapped){

                break;
            }
        }
    }

}
