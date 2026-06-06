import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee ID : ");
        int  empID = input.nextInt();

        System.out.print("Enter Department name : ");
        String department =input.next();

        switch(empID){
            case 1:
                System.out.println("Chhotu Pathak");
                break;

            case 2:
                System.out.println("Sarthak Chaubey");
                break;

            case 3:
                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;

                    case "Management":
                        System.out.println("Management Department");


                    default:
                        System.out.println("No Department entered");
                }

            default:
                System.out.println("Enter correct EmpID");

        }


    }

}
