package org.example.linkedlistexample;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("John");
        namesLinkedList.add("Ringo");
        namesLinkedList.add("Paul");
        namesLinkedList.add("George");
        System.out.println(namesLinkedList.get(2));
        namesLinkedList.add(1,"Mike");


        String[] names = new String[4];
        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("John");
        namesArrayList.add("Ringo");
        namesArrayList.add("Paul");
        namesArrayList.add("George");
        System.out.println(namesArrayList.get(2));
        namesArrayList.add(1,"Mike");

        //{"John", "Ringo", "Paul", "George";}
        //{"John", "Mike" , "Ringo", "Paul", "George"}


    }
}
