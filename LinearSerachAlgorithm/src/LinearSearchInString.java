import java.util.Arrays;
public class LinearSearchInString {
    public static void main(String[] args){
        String name = "chhotu";
        char target = 'u';

        System.out.println(Arrays.toString(name.toCharArray()));

        boolean ans = search(name,target);
        System.out.println(ans);
    }

    static boolean search(String name, char target){
        if(name.length() == 0){
            return false;
        }

//        for(int i = 0; i < name.length();i++){
//            if(name.charAt(i) == target){
//                return true;
//            }
//        }
//
//        return false;

        for(char ch : name.toCharArray()){
            if(ch == target){
                return true;
            }
        }

        return false;
    }
}
