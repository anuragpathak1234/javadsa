
import java.util.Scanner;
import java.util.Arrays;
public class ArrayInputOutput {
    public static void main(){
//        int[] arr = new int[5];

//        arr = new int[]{10,20,30,40,50}; // reassiments
//
//        System.out.println(arr[3]);

//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;


        // Declaration + assiments

        //int[] arr = {1,2,3,4,5}


        // TAKING INPUT AND OUTPUT BY USERS

//        Scanner input  = new Scanner(System.in);
//
//        System.out.print("Enter Size of the array : ");
//
//        int n = input.nextInt();
//
//        int[] arr = new int[n];
//
//        for(int i = 0; i < n; i++){
//            arr[i] = input.nextInt();
//        }

//        for(int i = 0; i < n; i++){
//            System.out.print(arr[i] + " ");
//        }

//        for(int num : arr){ // FOR EVERY ELEMENTS OF ARRYAS / PRINT EACH ELEMNTS
//            System.out.print(num + " "); // HERE NUM REPRESNTS ARRAY OF ELEMENTS
//        }


//        System.out.println(Arrays.toString(arr));


        // Array of Objects




        Scanner input = new Scanner(System.in);

        String[] str = new String[4];

        for(int  i = 0; i < 4; i++){
            str[i] = input.next();
        }

//        for(int i = 0; i < 4; i++){
//            System.out.println(str[i] + " ");

        System.out.println(Arrays.toString(str));

    }
}
