import java.util.Scanner;

public class LearningRtn {

    public static void main(String[] args){
        System.out.println(sum());

    }

    static int sum(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1 : ");
        int num1 = input.nextInt();

        System.out.print("Enter num2 : ");
        int num2 = input.nextInt();

        int sum1 = num1 + num2;
        return sum1;

    }
}
