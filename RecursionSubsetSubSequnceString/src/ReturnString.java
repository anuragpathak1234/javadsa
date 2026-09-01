public class ReturnString {

    public static void main(String[] args){

    System.out.println(skip("abccad"));





    }

    static String skip(String original){
        if(original.isEmpty()){
            return " ";
        }

        char ch = original.charAt(0);

        if(ch == 'a'){

            return skip(original.substring(1));
        }

        else{

            return ch  + skip(original.substring(1));
        }

    }
}
