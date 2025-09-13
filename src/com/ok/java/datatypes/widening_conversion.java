package com.ok.java.datatypes;

public class widening_conversion {
    public static void main(String[] args) {
        System.out.println("Widening Conversion example");
        System.out.println("--------------------");
        //smaller thing put into bigger
        byte byteValue = 10 ; //1 byte  //cup
        short shortValue = byteValue; //2 bytes // glass
        int intValue  = shortValue; // 4 bytes  //jug
        long longValue = intValue; // 8 bytes //bucket
        float floatValue = longValue; // 4 bytes
        double doubleValue = floatValue; // 8 bytes
        System.out.println("int:"+intValue);
        System.out.println("long:"+longValue);
        System.out.println("float:"+floatValue);
        System.out.println("double:"+doubleValue);
        System.out.println();

//        Opposite of Widening --> Narrowing
        System.out.println("Narrowing Conversion Example");
        System.out.println("-----------------------------");
//        buket --> cup me dal diya overflow to hoga for that we have to mention it float floatValue2 = (float) doubleValue;   like this
        double doubleValue2 = 123.456;
        float floatValue2 = (float) doubleValue2;  //Narrowing conversion from double to float
        long longValue2 = (long) floatValue2;  //Narrowing conversion from float to long
        int intValue2 = (int) longValue2;  //Narrowing conversion from long to int
        System.out.println("double:" + doubleValue2);
        System.out.println("float:" + floatValue2);
        System.out.println("long:" + longValue2);
        System.out.println("int:" + intValue2);
        System.out.println();


    }
}

