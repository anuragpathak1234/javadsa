
import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter fruits name  : ");
        String fruits = input.next();

        switch(fruits){
            case "Mango":
                System.out.println("Kings of Fruits");
                break;

            case "Apple":
                System.out.println("Red Sweets Fruits");
                break;

            default:
                System.out.println("Not a Fruits");
        }
    }

}
