import java.util.ArrayList;

import static java.util.Collections.list;


public class FactorsOptimized {
    public static void main(String[] args){

        factors(20);
    }
    static void factors(int n) {

//        for(int i = 1; i < Math.sqrt(n); i++){
//            if(n % i == 0){
//                if(n / i == i){
//                    System.out.print(i + " ");
//                }
//
//                else{
//                    System.out.print(i + " " + n / i + " ");
//                }
//            }
//        }
//    }
        // Both Time And Space Will BE SQRT Of One

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i < Math.sqrt(n); i++){
            if(n % i == 0){
                if(n / i == i){
                    System.out.print(i +  " ");
                }
                else{
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }

        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i) +  " ");
        }

    }
}
