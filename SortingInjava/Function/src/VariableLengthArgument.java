import java.util.Arrays;
public class VariableLengthArgument {
    public static void main(String[] args){
//        fun(10,20,47,89,47,48,48,3);

        multiple(10,20,"chhotu", "Rahul", "anuj", "Rohit");



    }

    static void multiple(int a, int b, String ...name){
        System.out.println(a + ", " + b  + ", " + Arrays.toString(name));

//    static void fun(int ...nums){
//        System.out.println(Arrays.toString(nums));
    }
}
