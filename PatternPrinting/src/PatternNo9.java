//import java.util.
import java.util.Scanner;
public class PatternNo9 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter num  : ");

        int n  = input.nextInt();
        pattern9(n);
    }
    static void pattern9(int n){

        int size  = 2 * n - 1;

        for(int rows = 0; rows < size; rows++){

            for(int cols = 0; cols  < size; cols++){

                int top  = rows;
                int left = cols;

                int buttom = size - rows - 1;
                int right = size  - cols   - 1;

                int min = Math.min(Math.min(top,buttom), Math.min(left, right));
                System.out.print((n - min) +    " ");
            }

            System.out.println();
        }
    }
}
