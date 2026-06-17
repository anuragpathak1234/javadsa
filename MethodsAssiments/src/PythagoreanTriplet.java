import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1 : ");
        int num1 = input.nextInt();

        System.out.print("Enter num2  : ");
        int num2  = input.nextInt();

        System.out.print("Enter num3 : ");
        int num3 = input.nextInt();


        int sum1 = Math.pow((num1,2)) + Math.pow((num2, 2));

        int sum2 = Math.pow(num3 , 2);

        if(sum1 == sum2){
            System.out.println("Triplet is pythangorean");
        }

        else{
            System.out.println("Triplet is not pythangorean");
        }

    }
}
