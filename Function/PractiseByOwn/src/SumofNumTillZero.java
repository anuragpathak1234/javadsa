import java.util.Scanner;
public class SumofNumTillZero {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);




        System.out.println(result(input));
    }

    static int result(Scanner input){
        int sum = 0;

        while(true){
            int n  = input.nextInt();
            if(n == 0) break;
            sum = sum + n;
        }

        return sum;
    }
}
