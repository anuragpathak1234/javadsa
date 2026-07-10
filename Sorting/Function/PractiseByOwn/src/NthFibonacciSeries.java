import java.util.Scanner;

public class NthFibonacciSeries {
    public static void main(String[] args){

        int a = 0;
        int b = 1;

        Scanner input = new Scanner(System.in);


        System.out.print("Enter num : ");
        int n = input.nextInt();

        for(int i = 0; i < n; i++){
            int next = a + b;
            System.out.println(a + " ");
            a = b;
            b = next;
        }
    }
}
