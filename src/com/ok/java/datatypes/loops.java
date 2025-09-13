package com.ok.java.datatypes;

public class loops {
    public static void main(String[] args) {
//        for loop
//        enhanced for loop ( for-each loop)
//        while loop
//        do-while loop

        System.out.println("While looop");
        int i = 0;
        while(i<=3){
            System.out.println("hello");
            i++;
        }

        System.out.println();

        System.out.println("For loop");
        for (int j = 0; j < 5; j++){
            System.out.println(j);
        }

        System.out.println();
        System.out.println("Enhanced for loop");

        int[] arr = {1,3,5,7,9,11};
        for(int num : arr){
            System.out.println(num);
        }

        System.out.println();
        System.out.println("do-while loop");
       int k =5;
        do{
            System.out.println("i run at least one time");
        }while (k<4);

    }
}
