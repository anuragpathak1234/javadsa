package com.chhotu.packages.staticExample;




public class InnerClasses {

    static class Test{

        String name;

        Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args){
        Test a = new Test("Chhotu");
        Test b = new Test("Rohit");

        System.out.println(a.name);
        System.out.println(b.name);

    }
}
