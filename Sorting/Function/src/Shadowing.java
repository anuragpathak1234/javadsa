import java.util.Scanner;

public class Shadowing {

    static int shadowing = 90; // this is know as shadowing

    public static void main(String[] args){
        System.out.println(shadowing); // 90

        int shadowing = 40;   // this is class variable
        System.out.println(shadowing); // 40
        fun();

    }

    static void fun(){
        System.out.println(shadowing); // 90
    }
}
