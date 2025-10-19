// Java program to find numbers dividable by 3

package com.numbers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// com.numbers.Main class
public class Main {

    // com.numbers.Main method to run java program
    public static void main(String[] args) {

        // Creating list with integers
        List<Integer> list = new ArrayList<>();

        // Adding 1501 elements to a list
        for (int index = 0; index < 1501; index++) {
            list.add(index);
        }

        // Printing list to console
        System.out.println(list);

        // Checking if numbers are dividable by 3
        Iterator<Integer> it = list.listIterator();

        // Loop to go through the list
       while (it.hasNext()) {

           // Saving current value of the list
           int number = it.next();

           // Condition
           if(number % 3 == 0) {

               // Printing result to console
               System.out.println(number + " is dividable by 3.");

           } else {

               // Printing result to console
               System.out.println(number + " is not dividable by 3.");
           }
       }
    }
}