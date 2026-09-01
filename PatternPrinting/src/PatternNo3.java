
import java.util.Scanner;
public class PatternNo3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


        System.out.print("Enter n : ");
        int n = input.nextInt();

        pattern3(n);

    }

    static void pattern3(int n){

        for(int rows = 0; rows < n; rows++){
            for(int cols = 0; cols < n -rows; cols++){

                System.out.print("* ");
            }
             System.out.println();
        }
    }
}
