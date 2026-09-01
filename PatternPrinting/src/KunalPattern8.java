import java.util.Scanner;
public class KunalPattern8 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Num");

        int n = input.nextInt();
        kunalpattern8(n);
    }

    static void kunalpattern8(int n){

        for(int rows = 1; rows <= n; rows++){

            //SPACES

            for(int s = 0; s < n- rows; s++){
                System.out.print(" ");
            }

            for(int cols = 0; cols < n; cols--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
