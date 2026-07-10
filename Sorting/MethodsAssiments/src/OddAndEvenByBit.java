import java.util.Scanner;

public class OddAndEvenByBit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num : ");
        int n = input.nextInt();
        OddEven(n);
    }

    static void OddEven(int n){
        if((n & 1) == 0){
            System.out.println(n + " is Even Numbers ");
        }
        else{
            System.out.println(n + " Is  Odd numbers ");
        }
    }
}
