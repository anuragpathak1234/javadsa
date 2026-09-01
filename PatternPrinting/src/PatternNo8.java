import java.util.Scanner;
public class PatternNo8 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter num : ");

        int n = input.nextInt();
        pattern8(n);
    }

    static void pattern8(int n){

        for(int rows  = 0; rows < 2 * n - 1; rows++){

            int totalcolumns ;

            if(rows < n){
                totalcolumns = rows + 1;
            }

            else{
                totalcolumns = 2 * n - rows - 1;
            }

            // Spaces

            for(int s = 0; s < n - totalcolumns; s++){
                System.out.print("  ");
            }

            //Decreasing Num

            for(int cols = totalcolumns; cols >= 1; cols --){
                System.out.print(cols  + " ");
            }

            for(int cols = 2; cols <= totalcolumns; cols++){
                System.out.print(cols + " ");
            }

            System.out.println();
        }


    }
}
