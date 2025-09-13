package com.ok.java.oops;

public class abstractclass {
    public static void main(String[] args) {
        person p = new person();
        p.sleep();
        p.sayHello();
        p.sayBye();

    }
}


abstract class Anybody{
    abstract void sayHello();
    abstract void sayBye();

    void sleep (){
        System.out.println(".zz....zz...");
    }
}

class person extends Anybody{

    @Override
    void sayHello() {
        System.out.println("hola");
    }

    @Override
    void sayBye() {
        System.out.println("Sayonara");

    }
}

interface mobile{
    void makecall();
}
interface Battery{
    void battery();
}
//interface implementation
class mob implements mobile,Battery{
    @Override
    public void makecall() {
        System.out.println("make call");
    }
    public void battery(){
        System.out.println("battery");
    }
}