package com.ok.java.oops;

public class Test {
    public static void main(String[] args) {
//      Object of class car
        Car car = new Car("Green");
        car.setSpeed(400);

        Child child = new Child();
        child.name ="vansh";


    }


}

//hierarchical inheritance

class Child extends Parent{


}
class Parent extends GrandParent{

}
class GrandParent{
    String name;

}


//Java does not submit multiple inheritance

class Camera{
    void capture(){
        System.out.println("Capture");
    }
    void turnon(){
        System.out.println("Turing on...");
    }

}
class Musicplayer{
    void music(){
        System.out.println("Music");
    }
    void turnon(){
        System.out.println("Turing on...");
    }

}

class Phone {
    void call(String number){
        System.out.println("Call"+number);
    }
    void turnon(){
        System.out.println("Turing on...");
    }
}

//class SmartPhone extends  Camera{
//
//}
