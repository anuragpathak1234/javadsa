import java.util.Scanner;

public class DistanceBetweenTwoPoints {

    public static void main(String[] args){
        int x1 = 1;
        int x2 = 4;

        int p1 = x2 - x1;

        int y1 = 2;
        int y2 = 6;

        int  p2 = y2 - y1;

        double distance = Math.sqrt(Math.pow(p1,2) + Math.pow(p2,2));

        System.out.println(distance);


    }
}
