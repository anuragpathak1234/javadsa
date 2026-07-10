import java.util.Scanner;
public class LeetcodeQ1281 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num : ");
        int n = input.nextInt();
        System.out.println(result(n));
    }

    static int result(int n){
        int sum = 0;
        int product = 1;
        while(n > 0){
            int rem = n  % 10;
            sum = sum + rem;
            product = product * rem;
            n = n / 10;
        }

        return product - sum;

    }

    }

