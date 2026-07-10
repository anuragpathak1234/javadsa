import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        System.out.print("Enter num : ");
        int n = input.nextInt();

        int ans = factorial(n);
        System.out.println(ans);

    }

    static int factorial(int n){
        if( n == 0 && n == 1) return 1;

        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }

        return fact;
    }
}
