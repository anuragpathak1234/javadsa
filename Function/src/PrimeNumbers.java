import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Enter num :");
        int n = input.nextInt();

        boolean ans = isprime(n);
        System.out.println(ans);
    }

    static boolean isprime(int n){
        if(n <= 1){
            return false;
        }

        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;


    }
}
