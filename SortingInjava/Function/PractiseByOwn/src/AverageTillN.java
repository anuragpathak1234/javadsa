import java.util.Scanner;
public class AverageTillN {
    public static void main(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter num : ");
        int n = input.nextInt();

        int sum = 0;

        for(int i = 1;  i <= n; i++){
            int num = input.nextInt();
            sum = sum + num;


        }

        double average = (double) sum/ n;

        System.out.println(average);
    }
}
