public class SB {
    public static void main(String[] args){

//        StringBuilder builder = new StringBuilder();
//
//        for(int i = 0 ; i < 26; i++){
//            char ch = (char)('a' + i);
//            builder.append(ch);
//        }
//
//        System.out.println(builder.toString());

        // APPEND
//        StringBuilder sb = new StringBuilder();
//        sb.append("Java");
//        sb.append(" ");
//        sb.append("DSA");
//
//        System.out.println(sb);


        // INSERT()

//        StringBuilder sb  = new StringBuilder("java");
//
//        sb.insert(4,  " Programing");
//
//        System.out.println(sb);

        //Delete

//        StringBuilder sb = new StringBuilder("java Programming");
//        sb.delete(4,16);
//        System.out.println(sb);

        // REplace

        StringBuilder sb = new StringBuilder("java");
        sb.replace(0,4,"python");
        System.out.println(sb);
    }
}
