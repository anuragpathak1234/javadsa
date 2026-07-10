import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
//        int age = 18;
//        if( age >= 18){
//            System.out.println("Eligiblr for vote");
//        }
//
//        else{
//            System.out.println("Not eligible");
//        }
//    }
//}


        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();

        if (salary > 1000) {
            salary += 2000;
            System.out.println(salary);

        }

        else if (salary > 1000 && salary < 10000) {
            salary -= 5000;
            System.out.println(salary);
        }

        else {
            salary += 1000;
            System.out.println(salary);
        }

    }

}

