import java.util.Scanner;

public class EvendaysinAugust {

    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);

//        int days = input.nextInt();

        int count = 0;

        for(int days = 1; days <= 31; days++){
            if(days % 2 == 0){
                count++;
            }
        }

        System.out.println("Kunal will go outside for " +  count +  " days" );
    }
}
