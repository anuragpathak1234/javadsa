import java.util.Scanner;

public class PelindromeNUmber {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int original = num ;
        int rev = 0;

        while(num > 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num  = num / 10;

        }

        if(rev == original){
            System.out.println("Num is polindrome num");
        }

        else{
            System.out.println("num is not a polindrome num");
        }
    }
}
