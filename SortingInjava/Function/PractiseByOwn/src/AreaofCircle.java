import java.util.Scanner;
public class AreaofCircle {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter num : ");
        int radius  = input.nextInt();

        double pi = 3.14159;

        double Area = radius * radius * pi;

        System.out.println(Area);

    }
}
