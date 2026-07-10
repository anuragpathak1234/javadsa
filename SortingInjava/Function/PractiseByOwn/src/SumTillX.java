
import java.util.Scanner;
public class SumTillX {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int sum = 0;

        while(true){
            String num = input.next();
            if(num.equalsIgnoreCase("X")){
                break;
            }

            int n = Integer.parseInt(num);
            sum= sum + n;
        }


     System.out.println("sum = " + sum);

    }
}
