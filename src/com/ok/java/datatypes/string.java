package com.ok.java.datatypes;

public class string {
    public static void main(String[] args) {
        int a = 1; //stack& heap (string pool)
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2); //true cuz same reference in pool
        System.out.println(str1 == str3); //false(different object)
        System.out.println(str1.equals(str3)); //true cuz same content

        System.out.println("String Immutability");
        System.out.println("---------------------------");
        String name = "Vansh";
        name.toUpperCase(); //you can try toLowerCase()
        System.out.println(name); //Still Print "Vansh"
        System.out.println();

//        Correct Way
        name = name.toUpperCase(); //create new string
        System.out.println(name);
        System.out.println();

        System.out.println("Common String Operations");
        String text = "Hello Universe";
//        Length
        System.out.println(text.length()); //14

//        Accessing Character
        System.out.println(text.charAt(0)); //'H'

//        Substring
        System.out.println(text.substring(0,5)); //"Hello"

//        Contains, startsWith, endsWith
        System.out.println(text.contains("Universe")); //true

//        Replace
        String newText = text.replace("Universe","Java");
        System.out.println(newText);


    }

}
