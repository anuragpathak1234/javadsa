import java.util.Scanner;

public class Armstrong {
    public static void main(){

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter input : ");
//        int n = input.nextInt();

//        boolean ans = isArmstrong(n);
//
//        System.out.println(ans);

        for(int  i = 100; i < 10000000; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");

            }
        }
    }

    static boolean isArmstrong(int n){

        int original  = n;
        int sum  = 0;

        while(n > 0){
            int rem = n % 10;
            n = n /10;
            sum = sum + rem * rem * rem;
        }


    return sum == original;

    }
}
