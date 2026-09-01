import java.util.Scanner;

public class PatternNo7 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n  : ");

        int n = input.nextInt();

        pattern7(n);
    }

    static void pattern7(int n){

        for(int rows = 1; rows <= n; rows++){

            // spaces
            for(int s  = 0; s < n- rows; s++){
                System.out.print("  ");
            }

            // Decreasing column

            for(int cols = rows; cols >= 1; cols--){
                System.out.print(cols + " ");
            }

            //Increasing Column
            for(int cols = 2; cols <= rows; cols++){
                System.out.print(cols + " ");
            }

            System.out.println();
        }
    }
}
