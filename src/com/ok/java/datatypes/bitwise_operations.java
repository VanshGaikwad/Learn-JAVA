package com.ok.java.datatypes;

public class bitwise_operations {
    public static void main(String[] args) {
        int a = 5; //0101
        int b = 3; //0011

//        AND operation (&)
        System.out.println("AND operation");
        System.out.println("5 & 3 = " + ( a & b));
        System.out.println("Binary:" +Integer.toBinaryString(a&b));

        //        OR operation (|)
        System.out.println("\nOR operation");
        System.out.println("5 | 3 = " + ( a | b));
        System.out.println("Binary:" +Integer.toBinaryString(a|b));


        //        XOR operation (^)
        System.out.println("\nXOR operation");
        System.out.println("5 ^ 3 = " + ( a ^ b));
        System.out.println("Binary:" +Integer.toBinaryString(a^b));


        //        NOT operation (~)
        System.out.println("\nNOT operation");
        System.out.println("~5 = " + ( ~a ));
        System.out.println("Binary:" +Integer.toBinaryString(~a));

        //        Left shift operation (<<)
        System.out.println("\nLeft operation");
        System.out.println("5 << 1  = " + ( a << 1 ));
        System.out.println("Binary:" +Integer.toBinaryString(a << 1));

        //        Right shift operation (>>)
        System.out.println("\nRight operation");
        System.out.println("5 >> 1  = " + ( a >> 1 ));
        System.out.println("Binary:" +Integer.toBinaryString(a >> 1));








    }
}
