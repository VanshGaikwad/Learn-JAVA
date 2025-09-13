package com.ok.java.oops;

public class method_overloading {
//    Polymorphism
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("hello");
        printer.print(5);

    }


}

class Printer{
    void print(String s){
        System.out.println("Sting :" +s);
    }
    void print(int num){
        System.out.println("Integer:"+num);
    }


}
