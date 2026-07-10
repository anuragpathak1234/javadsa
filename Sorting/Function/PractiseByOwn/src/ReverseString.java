import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your String     : ");
        String str = input.next();

//        String reversed = "";
//
//        for(int i = str.length() - 1; i >= 0; i--){
//            reversed = reversed + str.charAt(i);
//        }
//
//        System.out.println(reversed);



        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        String reversed = sb.toString();

        System.out.println(reversed);
    }
}
