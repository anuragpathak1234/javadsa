import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a ");
        int a = input.nextInt();

        System.out.print("Enter b ");
        int b = input.nextInt();



        System.out.print("Enter c ");
        int c = input.nextInt();

//        if( a > b && a > c){
//            System.out.println(a  + " is largest");
//        }
//
//        else if(b > a && b > c){
//            System.out.println(b + " is largest");
//        }
//
//        else{
//            System.out.println(c + " is largest");
//        }

//        int max = a;
//
//        if(b > max){
//            max = b;
//        }
//
//        if(c > max){
//            max = c;
//        }
//
//        System.out.println(max);


//        int max = 0;
//
//        if(a > b){
//            max = a;
//        }
//
//        else{
//            max = b;
//        }
//
//        if ( c > max){
//            max = c;
//        }
//
//        System.out.println(max);


        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);



    }
}
