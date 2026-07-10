import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.print("Enter num : ");
        int n = input.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n + "*" + i  + " = " + n * i);
        }
    }
}
