import java.util.Scanner;

public class PrimeNumByMethod {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your num : ");
        int num = input.nextInt();

        boolean ans  = isPrime(num);
//        System.out.println(ans);
        for(int i = 2; i < num; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int num){
        if(num == 1 && num == 0){
            return false;
        }

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
