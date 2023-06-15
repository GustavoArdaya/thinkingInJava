package com.thinkinginjava.udemy.S10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayList {

    public static void main(String[] args) {

        String[] originalArray = new String[] {"First", "Second", "Third", "Fourth", "Fifth"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "One"); // since list was made from array, it shares same address, so this will also change original array
        System.out.println("List: " + originalList);
        System.out.println("Array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("Array: " + Arrays.toString(originalArray));

        // originalList.remove(0); // this wont be allowed as it would change source file too
        // elements cannot be added either. The only benefit would be to use list methods on arrays.

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday"); // this creates fixed size list
        System.out.println(newList);
        // newList.remove(0); // not allowed with asList method // ist mutable but not resizable. List.of is IMMUTABLE!
    }
}
