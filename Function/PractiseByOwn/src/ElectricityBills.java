import java.util.Scanner;
public class ElectricityBills {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter num : ");
        int units = input.nextInt();
        double bill ;

        if(units <=100){
            bill = units * 1.50;
        }

        else if( units <= 200){
            bill = 100 * 1.50 + (units - 100) * 2.50;
        }

        else if(units <= 300){
            bill = 100 * 1.50  + 100 * 2.50 + (units - 200)  * 4.00;
        }

        else{
            bill = 100 * 1.50 + 100 * 2.50 + 100 * 4.00 + (units - 300) * 5.00;
        }

        System.out.println(bill);
    }
}
