import java.util.Scanner;

public class MaxAndMinAmongThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();

        System.out.print("Enter num3 : ");
        int num3 = sc.nextInt();

        int max = largest(num1,num2,num3);
        int min = smallest(num1,num2,num3);

        System.out.println("Largest among "+ num1 + ", " + num2 + ", " + num3 + " is " + max);
        System.out.println("Smallest among " + num1 + ", " + num2 + ", "  + num3 + " is " + min);
    }

    static int largest(int num1 , int num2, int num3){
        int max = num1;
        if(num2 > max){
            max = num2;
        }

        if(num3 > max){
            max = num3;
        }

        return max;
    }


    static int smallest(int num1, int num2, int num3){
        int min = num1;
        if(num2 < min){
            min = num2;
        }

        if(num3 < min){
            min = num3;
        }

        return min;
    }
}
