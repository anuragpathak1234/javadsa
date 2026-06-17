import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[]  args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter");
        int base = input.nextInt();
        int height = input.nextInt();

        int Area = (base   * height ) / 2;

        System.out.println(Area);

    }
}
