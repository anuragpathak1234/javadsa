import java.util.Scanner;
public class LeapYears {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

//        if((n  % 400 == 0) || (n % 4 == 0 && n % 100 != 0)){
//            System.out.println(" Leap years");
//        }
//
//        else{
//            System.out.println(" Not a leap years");
//        }

        boolean ans = isLeap(n);
        System.out.println(ans);
    }

    static boolean isLeap(int n){
        if((n % 400 == 0) || (n % 4 == 0 && n % 100 != 0)){
            return true;
        }

        else
            return false;


    }



}
