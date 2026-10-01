package com.chhotu.packages.staticExample;

public class Human {

    int age;
    String name;
    int salary;
    boolean married;
     static long population;


     static void message(){
         System.out.println("Hello World");
        // System.out.println(this.age) // you can use this in static because it need instance and
         // static is independent of instances;
     }


    Human(int age, String name,int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population += 1;
    }
}
