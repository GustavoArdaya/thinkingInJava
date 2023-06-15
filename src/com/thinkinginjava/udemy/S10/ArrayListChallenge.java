package com.thinkinginjava.udemy.S10;

import java.util.*;
import java.util.ArrayList;

public class ArrayListChallenge {
    public static List<String> list = new ArrayList<>();
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            int choice;
            list.sort(Comparator.naturalOrder());
            System.out.println("List is currently: " + list);
            System.out.println("Available actions:");
            System.out.println("0 - to shutdown\n1 - to add item(s) to list (comma delimited list)" +
                    "\n2 - to remove item(s) from list (comma delimited)");
            System.out.println("Please enter a number: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 0: exit = true; break;
                case 1: addItems(); break;
                case 2: deleteItems(); break;
            }
        }
        System.out.println("Bye!");
    }

    private static void deleteItems() {
        Scanner addScanner = new Scanner(System.in);
        String line;
        System.out.println("Enter Item (separated by commas if multiple items)");
        line = addScanner.nextLine();
        List<String> tempList = Arrays.asList(line.split(","));
        for (int i = 0; i < tempList.size(); i++) {
            if (list.contains(tempList.get(i).trim())) {
                list.remove(tempList.get(i).trim());
            } else {
                System.out.println("Item " + tempList.get(i).trim() + " is not in list.");
            }
        }
    }

    private static void addItems() {
        Scanner addScanner = new Scanner(System.in);
        String line;
        System.out.println("Enter Item (separated by commas if multiple items)");
        line = addScanner.nextLine();
        List<String> tempList = Arrays.asList(line.split(","));
        for (int i = 0; i < tempList.size(); i++) {
            if (!list.contains(tempList.get(i).trim())) {
                list.add(tempList.get(i).trim());
            } else {
                System.out.println("Item " + tempList.get(i).trim() + " is already in list. It will not be added.");
            }

        }
        //list.addAll(tempList);
    }
}
