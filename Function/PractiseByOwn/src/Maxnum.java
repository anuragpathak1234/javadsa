import java.util.Scanner;
public class Maxnum {
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int max = Math.max(a,b);

        System.out.println(max + " is a max number among " +  a + " and " +  b);
    }
}
