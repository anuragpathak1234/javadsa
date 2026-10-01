package com.chhotu.packages.staticExample;

public class Main {
    public static void main(String[] args){
//        Human kunal = new Human(18,"Kunal",20000,false);
//        Human rahul = new Human(10,"Rahul",30000,true);
//
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);


               // internally fun2 object will created like this because we know fun2 is non static
                // and everthing started from amin which is static so we have to craete a instance for that
                // and java does it internally for non static which start from class
                Main fun = new Main();
                fun.fun2();

    }

    static void fun(){

//        greeting(); // You can not use this because it required instance
        // but the function you are using it  does not depend on instances


        // you can't access not static stuff without referencing their instances in a static context

       // hence here i am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();
    }

    // we know that something which is non-static, belongs to objects
    void greeting(){
        System.out.println("Hello World");
    }
}
