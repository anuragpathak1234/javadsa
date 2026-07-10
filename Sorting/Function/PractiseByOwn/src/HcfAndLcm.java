import java.util.Scanner;
public class HcfAndLcm {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1   : ");
        int a = input.nextInt();

        System.out.print("Enter num2 : ");
        int b = input.nextInt();

        int num1 = a;
        int num2 = b;

        while( b != 0){
            int rem  = a % b;
             a = b;
             b = rem;
        }

        int hcf = a;
        int lcm = (num1 * num2) / hcf;

        System.out.println("HCf of " + num1 + " And " + num2 + " is " + hcf);
        System.out.println("LCM of " + num1 + " And " + num2  + " is " + lcm);

    }
}
