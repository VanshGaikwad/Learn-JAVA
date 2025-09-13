package com.ok.java.datatypes;

public class arrays {
//   Array: same type
//           fix size
public static void main(String[] args) {
//    declare array adn intialize together
    int[] a ={1,2,3,4,5};
//    use new keyword for explicit size and value
    int[] b = new int[] {12,3,5,6,};

//   create and emoty array with fixed size (default value will be 0)
    int[] c = new int[5];  //Array of size 5 -> [0,0,0,0,0]

//    display
    for (int i = 0;i<a.length;i++){
        System.out.println(a[i]);
    }

    System.out.println();
    System.out.println("using for each loop ");
    for (int num : a){
        System.out.println(num);
    }

}
}
