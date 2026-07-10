import java.util.Scanner;
public class SumFun {
    static int sum(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int a = input.nextInt();

        System.out.print("Enter num2 : ");
        int b = input.nextInt();

        int ans = sum(a,b);
        System.out.println(ans);
    }

}
