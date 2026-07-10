import java.util.Scanner;

public class NprAndNcr {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = input.nextInt();

        System.out.print("Enter r : ");
        int r = input.nextInt();


        System.out.println("NPR = " + npr(n,r));
        System.out.println("NCR = " + ncr(n,r));
    }

    static int Factorial(int n){
        if(n == 0 && n== 1) return 1;
        int fact = 1;

        for(int i = 1; i <= n; i++){
            fact  = fact * i;
        }

        return fact;

    }

    static int npr(int n, int r){
        return Factorial(n) / Factorial(n - r);
    }

    static int ncr(int n, int r){
        return Factorial(n) / (Factorial(r) * Factorial(n - r));
    }
}
