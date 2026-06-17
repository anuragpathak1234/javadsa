import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.print("Enter amount : ");
        int principle = input.nextInt();

        System.out.print("Enter Rate : ");
        int rate = input.nextInt();

        System.out.print("Enter time : ");
        int time = input.nextInt();

        int simple_interest = (principle * rate * time ) / 100;

        System.out.println(simple_interest);
    }
}
