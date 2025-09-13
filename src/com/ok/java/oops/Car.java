package com.ok.java.oops;

import java.lang.invoke.StringConcatFactory;

public class Car {
    private int speed;
   private String color;
   public Car(String color) //Default constructor
   {
        this.color = color;
   }

    void drive(){
        System.out.println("Driving....");
    }
    public void setSpeed(int speed){
       this.speed=speed;
       if (speed<0){
           System.out.println("Not possible");
       }
       else {
           System.out.println("Driving at:"+speed);
       }

    }

}

