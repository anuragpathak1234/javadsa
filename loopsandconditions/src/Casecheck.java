
import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter a char");
        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("lowercase");
        }

        else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Uppercase");
        }

        else{
            System.out.println("not a character");
        }
    }


}
