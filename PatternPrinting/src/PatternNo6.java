
import java.util.Scanner;
public class PatternNo6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n : ");

        int n = input.nextInt();
        pattern6(n);
    }

    static void pattern6(int n) {

        for (int rows = 0; rows < 2 * n; rows++) {

            int totalcolumns;


            if (rows < n) {
                totalcolumns = rows + 1;
            } else {
                totalcolumns = 2 * n - rows - 1;
            }

            int spaces;

            if (rows < n) {
                spaces = n - rows - 1;
            } else {
                spaces = rows - n + 1;
            }

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }


            for (int cols = 0; cols < totalcolumns; cols++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();
    }

}