import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


        System.out.print("Enter the amount : ");
        double principle = input.nextInt();

        System.out.print("Enter rate you wanna charge on amount  : ");
        double rate = input.nextInt();


        System.out.print("Enter a time in which you wanna suppose to take your money : ");
        double time = input.nextInt();

        double compound_interest = principle * Math.pow(1  + rate/ 100, time) - principle;

        System.out.println(compound_interest);
    }
}
