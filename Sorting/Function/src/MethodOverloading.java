import java.util.Arrays;
public class MethodOverloading {
    public static void main(String[] args){
        overloading(10);
        overloading("Chhotu");
        overloading(10,30,30,49,49,49,39);
    }
    static void overloading(int a){
        System.out.println(a);
    }

    static void overloading(String name){
        System.out.println(name);
    }

    static void overloading(int ...arr){
        System.out.println(Arrays.toString(arr));
    }
}
