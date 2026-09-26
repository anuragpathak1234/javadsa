public class Constructor {

    public static void main(String[] args){

        Student1 kunal = new Student1(13,"Kunal",75);
//        Student1 kunal = new Student1();

//        System.out.println(kunal.roll_no);
//        System.out.println(kunal.name);
//        System.out.println(kunal.marks);
//
//
//        kunal.greeting();


        Student1 random = new Student1(kunal);

//        System.out.println(random.name);


        Student1 random2 = new Student1();
        System.out.println(random2.name);

    }



}

class Student1{
    int roll_no;
    String name;
    float marks;


    // we need a way to add the values of the above properties object by object

    //we need one word to access every object

//    Student1(int roll,String name1, float marks1){
//        roll_no = roll;
//        name = name1;
//        marks = marks1;
//    }



    // paseed a object inside anothr object
    Student1 (Student1 other){

        this.roll_no = other.roll_no;
        this.name = other.name;
        this.marks = other.marks;
    }


    Student1(){
//        this.roll_no = 13;
//        this.name = "Chhotu";
//        this.marks = 67.7f;

        // this is how you call a constrictor from am another constructor
        this(13,"default person",18.3f);
    }



    Student1(int roll,String name1, float marks1){
      this.roll_no = roll;
      this.name = name1;
      this.marks = marks1;
   }

    void greeting(){
        System.out.println("my name is : " + name);
    }


}
