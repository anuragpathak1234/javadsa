import java.util.Arrays;

public class Basic {

    public static void main(String[] args){

        // store 5 roll no

//        int[] roll_no = new int[5];

        // store 5 name

//        String[] name = new String[5];

        // data of 5 students {roll,name,mark}
//        int[] roll_nos = new int[5];
//        String[] names = new String[5];
//        float[] marks = new float[5];


        // here we need class for storing all type of data type in one function

        // so class is basically combining property and function here property are - : roll,name , marks

        // now we are creating class student were we will store all propery of student



//        System.out.println(Arrays.toString(students));


//        Student[] students = new Student[5];
//
//        Student kunal; // just declare it , right now it is not pointing to any object
//
//
//        kunal = new Student(); // now it pointing to object of class studnet


        Student kunal = new Student();

        kunal.rno = 13;
        kunal.name =  "kk";

        kunal.marks = 76.2f;




        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);


    }

    // create class

    // for every single student
}

class Student{

    int rno ;
    String name ;
    float marks ;

}
