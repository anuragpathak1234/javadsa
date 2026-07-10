import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        // finding fibonacci series

        Scanner input = new Scanner(System.in);

        System.out.print("Enter num : ");
        int n = input.nextInt();

        int a = 0;
        int b = 1;

        for(int i = 0; i < n; i++){
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }


        // FINDING NTH FIBONACCI NUMBER
//        int a = 0;
//        int b  = 1;
//
//        for(int  i = 2; i < n; i++){
//            int temp = a + b;
//              a  = b;
//              b = temp;
//
//        }
//        System.out.print(b);




    }
}
