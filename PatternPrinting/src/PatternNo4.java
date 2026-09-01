import java.util.Scanner;
public class PatternNo4 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = input.nextInt();

        pattern4(n);
    }

    static void pattern4(int n){

        for(int rows  = 1; rows <= n; rows++){

            for(int col = 1; col <= rows; col++){

                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
}
