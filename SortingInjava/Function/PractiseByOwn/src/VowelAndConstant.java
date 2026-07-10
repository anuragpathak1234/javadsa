import java.util.Scanner;

public class VowelAndConstant {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your String : ");
        char ch = input.next().charAt(0);
        ch = Character.toLowerCase(ch);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        }

        else {
           System.out.println("Constant");
        }
    }
}
