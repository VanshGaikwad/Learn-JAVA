package com.ok.java.datatypes;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hello I'm Vansh");

        System.out.println("Byte Range");
        System.out.println("----------------");
        byte a = 127;
        System.out.println("Example byte value: " + a);
        System.out.println("Minimum byte value: " + Byte.MIN_VALUE); //-128
        System.out.println("Maximum byte value: " + Byte.MAX_VALUE); //127
        System.out.println();

        System.out.println("Short Range");
        System.out.println("----------------");
        byte b = 2;
        System.out.println("Example short value: " + b);
        System.out.println("Minimum short value: " + Short.MIN_VALUE); // -32,768
        System.out.println("Maximum short value: " + Short.MAX_VALUE); // 32,767
        System.out.println();

        System.out.println("Integer Range");
        System.out.println("----------------");
        int c = 2;
        System.out.println("Example integer value: " + c);
        System.out.println("Minimum integer value: " + Integer.MIN_VALUE); //-2^31 (32 bits)
        System.out.println("Maximum integer value: " + Integer.MAX_VALUE); // 2^31 -1
        System.out.println();

        System.out.println("Long Range");
        System.out.println("----------------");
        long d = 9223372036854775807l;
        System.out.println("Example long value: " + d);
        System.out.println("Minimum long value: " + Long.MIN_VALUE); // -2^63 (64 bits)
        System.out.println("Maximum long value: " + Long.MAX_VALUE); // 2^63 -1
        System.out.println();


        System.out.println("Float Range"); //~7 significant digits
        System.out.println("----------------");
        float e =123.456789f;
        System.out.println("Example float value: " + e);
        System.out.println("Smallest positive float value: " + Float.MIN_VALUE);
        System.out.println("Largest positive float value: " + Float.MAX_VALUE);
        System.out.println("Largest negative float value: -" + Float.MAX_VALUE);
        System.out.println("Smallest negative float value: -" + Float.MIN_VALUE);
        System.out.println();


        System.out.println("Double Range"); //~15 significant digits
        System.out.println("----------------");
        double f =123.456789012345678;
        System.out.println("Example double value: " + f);
        System.out.println("Smallest positive double value: " + Double.MIN_VALUE);
        System.out.println("Largest positive double value: " + Double.MAX_VALUE);
        System.out.println("Largest negative double value: -" + Double.MAX_VALUE);
        System.out.println("Smallest negative double value: -" + Double.MIN_VALUE);
        System.out.println();


        System.out.println("Boolean Example:");
        boolean isAdult = false ; //boolean datatype can hold only  2 value or 1 bit
        isAdult = true ;
        System.out.println("isAdult:"+isAdult);
        System.out.println();

        System.out.println("Character Example:");
        char character = 'C';
        System.out.println("Character:" + character);
        System.out.println("Each character assigned or mapped a value ");
        System.out.println("character value :"+(int) character);
        // in character data type we can also store symbols like heart symbol ,etc.
        //Common ASCII example (0-127 range)
        System.out.println("Minimum value :"+(int) Character.MIN_VALUE);
        System.out.println("Maximum value :"+(int) Character.MAX_VALUE);
        System.out.println((char)10084); //heart symbol
        System.out.println();



        System.out.println("String Example:");
        String name = "Vansh";
        System.out.println("String:" + name);
        System.out.println();








    }
}