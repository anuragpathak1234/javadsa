import java.util.Scanner;
public class PatternNo5 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n : ");

        int n = input.nextInt();

        pattern5(n);

    }
    static void pattern5(int n){

        for(int rows = 0; rows < 2 * n; rows++){

            int totalcolumn;

            if(rows < n){
                totalcolumn = rows + 1;
            }

            else{
                totalcolumn = 2 * n - rows - 1;
            }

            for(int cols = 0; cols < totalcolumn; cols++){

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
