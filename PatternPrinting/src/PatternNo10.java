
import java.util.Scanner;

public class PatternNo10 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter num : ");

        int num = input.nextInt();
        pattern10(num);
    }

    static void pattern10(int num){

        for(int rows  = 1; rows <= num; rows++){

            // LEADING SPACES

            for(int s = 0; s < num - rows; s++){
                System.out.print(" ");
            }

            // INCREASING NUMBER

            for(int cols = 1; cols <= rows; cols++){
                System.out.print(cols);
            }

            // Middle space

            for(int s = 0; s < 2 * (num - rows); s++){
                System.out.print(" ");
            }

            // DEACRISING NUMBER

            for(int cols = rows; cols >= 1; cols--){
                System.out.print(cols);
            }

            System.out.println();
        }
    }
}












