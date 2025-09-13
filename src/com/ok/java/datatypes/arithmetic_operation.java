package com.ok.java.datatypes;

public class arithmetic_operation {
    public static void main(String[] args) {
        int a = 5 + 3; //result is 8
        System.out.println(a);
        int b = 10 - 4; // result is 6
        System.out.println(b);
        int c = 6 * 7; // result is 42
        System.out.println(c);
        int d = 10 / 3; // result is 3 (integer division)
        System.out.println(d);
        double e = 10.0 / 3.0; // result is 3.333... (float-point division)
        System.out.println(e);
        int f = 10 % 3; //result is 1
        System.out.println(f);

//        shortcuts
        a += 3;
        a -= 3;
        a *= 2;
        a /= 4;
        a %= 4;


//        post inc., pre inc., post dec, pre dec.
        a++; //post increment
        ++a; //pre increment
        a--; //post decrement
        --a; //pre decrement

//        Binary string
        int binary = 2;
        System.out.println(Integer.toBinaryString(binary));


    }
}
