package com.ok.java.datatypes;

public class conditional_statements
{
    public static void main(String[] args) {
        boolean isSunny = true;
        boolean isWarm = false;
        if(isSunny && isWarm){
            System.out.println("Beach day");
        } else if (isSunny) {
            System.out.println("wear jacket and then go to beach");

        } else {
            System.out.println("Rainy day");
        }

    }
}
