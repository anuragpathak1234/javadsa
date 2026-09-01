public class SkipString {
    public static void main(String[] args){

        System.out.println(skip("bcdapplefg"));


    }

    static String skip(String original){


        if(original.isEmpty()){
            return " ";
        }

        if(original.startsWith("apple")){

            return skip(original.substring(5));
        }

        else{

            return original.charAt(0) + skip(original.substring(1));
        }
    }

}
