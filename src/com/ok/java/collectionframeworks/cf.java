package com.ok.java.collectionframeworks;

import java.util.*;

public class cf {
    public static void main(String[] args) {

//        List --> Array List  & Linked List
//        Set --> HashSet & LinkedHashSet
//        Map --> HashMap & LinkedHashMap



        //   Array List
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);

        list.addAll(list2);
        System.out.println(list);

//        Linked List
        List<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        System.out.println(linkedlist);

//        Set
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(1);
        System.out.println(set.contains(1));
        System.out.println(set);

//        Map
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Vansh");
        map.put(2,"Riya");
        map.put(3,"Palash");

        System.out.println(map.get(2));

    }
}
