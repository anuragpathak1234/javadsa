import java.util.Scanner;
public class PatternNo1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = input.nextInt();

        pattern1(n);



    }

    static void pattern1(int n){

        for(int rows  = 1; rows <= n; rows++){
            // for every row, run the col

            for(int col = 1; col <= rows; col++){
                System.out.print("* ");
            }
            // when one row printed we need newline
            System.out.println();
        }
    }
}
