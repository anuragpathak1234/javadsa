
import java.util.Scanner;
public class PatternNo2 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n  : ");
        int n = input.nextInt();
        pattern2(n);

    }
     static void pattern2(int n){

        for(int rows = 1; rows <= n; rows++){
            for(int cols = 1; cols  < n; cols++){
                System.out.print("* ");
            }

            System.out.println();
        }
     }

}
