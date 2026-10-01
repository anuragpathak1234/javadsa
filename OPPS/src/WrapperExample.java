public class WrapperExample {
    public static void main(String[] args){



        Integer a = 10;
        Integer b = 20;



        swap(a,b);

        System.out.println(a  + " " +b);

       final A kunal = new A("Chhotu");

       kunal.name = "Other name";


       //when a non-premitive is final you can't reassign it

//        Kunal = new A("Other name");

    }

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A{
    String name;

    A(String name){
        this.name = name;
    }



}
