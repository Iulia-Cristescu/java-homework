package com.example.helloworld;
import java.util.Scanner;
import java.util.*;

public class Week2Homework {
    public static void main(String[] args) {
        /* Exercise 1 */
        String myString1 = "Hello, ";
        String myString2 = "World!";
        System.out.println(myString1.compareTo(myString2)); //compare lexicographically, based on the Unicode value of each character in the strings
        System.out.println(myString1.compareToIgnoreCase(myString2)); //compare lexicographically, ignoring lowercase nad uppercase differences
        System.out.println(myString1.equals(myString2)); //compare without considering the characters Unicode values
        System.out.println(myString1 + myString2);

        /* Exercise 2 */
        String enteredString = "";
        String reversedString = "";
        Scanner scannedString = new Scanner(System.in);
        System.out.println("Enter a string: ");
        enteredString = scannedString.nextLine();
        int length = enteredString.length();
        for (int i = length - 1; i >= 0; i--)
            reversedString = reversedString + enteredString.charAt(i);
        if (enteredString.equals(reversedString))
            System.out.println(enteredString + " is a palindrome.");
        else
            System.out.println(enteredString + " is not a palindrome.");

        /* Exercise 3 ??? */
        String emptyString = "";

        List<String> emptyList = new ArrayList<String>();

        List<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("GrapesX");
        for (String fruit : list) {
            if (fruit.startsWith("a") || fruit.startsWith("e") || fruit.startsWith("i") || fruit.startsWith("o") || fruit.startsWith("u")) {
                System.out.println(fruit.toLowerCase() + emptyString);
            } else {
                System.out.println(fruit.toUpperCase() + emptyList);
            }
            ;
            if (fruit.contains("x") || fruit.contains("X") || fruit.length() < 3) {
                System.out.println(fruit + Collections.replaceAll(list, fruit, "special"));
            }
            ;

        }

        /* Exercise 4 */
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Jack", "jack@test.com");
        map.put("Mary", "mary@test.com");
        map.put("Jason", "jason@test.com");

        System.out.println("This map has " + map.size() + " elements.");

        System.out.println("Does the name \"Matt\" is in this map? : " + map.containsKey("Matt"));
        for (String i : map.keySet()) {
            if (map.containsKey("Jack")) {
                System.out.println("The email that corresponds to Jack is: " + map.get(i));
            } else {
                System.out.println("There is no email for Jack.");
            }

            map.remove("Jack", "jack@test.com");
            System.out.println("Updated list of elements: " + map);

            SortedSet<String> keySet = new TreeSet<>(map.keySet());
            System.out.println("The map sorted by key is the following: " + keySet);
        }


    }
}



