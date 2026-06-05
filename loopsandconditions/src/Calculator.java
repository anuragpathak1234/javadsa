import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int ans = 0;

        while(true){


            Scanner input = new Scanner(System.in);

            System.out.print("Enter operator : ");
            char ch = input.next().trim().charAt(0);

            System.out.print("enter num1 : " );
            int num1 = input.nextInt();

            System.out.print("enter num2 : " );
            int num2 = input.nextInt();


            if(ch == '+'){
                ans =  num1 + num2;
            }

            else if(ch == '-'){
                ans = num1 - num2;
            }

            else if(ch == '*'){
                ans = num1 * num2;
            }

            else if(ch == '%'){
                ans = num1 % num2;
            }

            else if(ch == '/'){
                if(num2  != 0){
                    ans = num1 / num2;
                } else {
                    System.out.print("cannot divide by zero");
                    continue;
                }
            }

            else{
                System.out.print("invalid operator");
                continue;
            }

            System.out.println(ans);
            break;
        }
    }
}
