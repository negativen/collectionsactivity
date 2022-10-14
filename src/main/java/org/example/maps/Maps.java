package org.example.maps;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        //lowercase values do not work; must use full wrapper text
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("Nathan", 12345);
        empIds.put("Alex", 67890);
        empIds.put("Justin", 56709);
        System.out.println(empIds);

        //obtain Justin's key
        System.out.println(empIds.get("Justin"));

        //Search for Nathan's key
        //value should be true
        System.out.println(empIds.containsKey("Nathan"));

        //Search for Violet's key (does not exist)
        //value should be false
        System.out.println(empIds.containsKey("Violet"));

        //Search for a key with only a value of six
        //should be false
        System.out.println(empIds.containsValue(6));

        //search for a kew with contained values
        //should be true
        System.out.println(empIds.containsValue(56709));

        //updates user's empId to the new value
        //will insert new value
        empIds.put("Nathan", 8675309);
        empIds.put("Violet", 42);
        System.out.println(empIds);

        //replaces existing key with new value
        empIds.replace("Alex",1337);
        System.out.println(empIds);


        //adds new value if it doesn't exist
        empIds.putIfAbsent("Nathan", 808);
        empIds.putIfAbsent("Dakota",369);
        System.out.println(empIds);

        //Self-explanatory
        empIds.remove("Dakota");
        System.out.println(empIds);
    }
}
