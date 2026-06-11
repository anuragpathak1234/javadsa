import java.util.Scanner;

public class LcmWithoutHcf {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1 : ");
        int a = input.nextInt();

        System.out.print("Enter num2 : ");
        int b = input.nextInt();

        int lcm = Math.max(a,b);

        while(true){
            if(lcm % a == 0 && lcm % b == 0){
                System.out.println("LCM = " + lcm);
                break;
            }

            lcm++;
        }
    }
}
