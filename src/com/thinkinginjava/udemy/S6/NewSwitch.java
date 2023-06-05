package com.thinkinginjava.udemy.S6;

public class NewSwitch {

    public static void main(String[] args) {

        String month = "JANUARY";

        System.out.println(month + " belongs to the " + returnQuarter(month) + " quarter of the year");
    }

    public static String returnQuarter(String month) {

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> { yield "First"; }   // yield in code block
            case "APRIL", "MAY", "JUNE" -> "Second";
            case "JULY", "AUGUST", "SEPTEMBER" -> "Third";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "Fourth";
            default -> {
                String badResponse = month + " is not a valid month";
                yield badResponse;      // yield has to be inside code block to work
            }
        };
    }

}
