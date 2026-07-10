
import java.util.Scanner;
public class LargestNumTillZero {
    public static void main(String[]  args){

        System.out.println(result());
    }

    static int result(){
        Scanner input = new Scanner(System.in);

        int largest = 0;

        while(true){
            int n  = input.nextInt();
            if( n == 0) break;

            largest = Math.max(largest , n);
        }

        return largest;
    }
}
