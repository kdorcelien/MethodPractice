package com.pluralsight;

public class Format {
    public static void main(String[] args) {
       String first = "Bob";
       String last = "Smith";
         formatName(first,last);
        System.out.println(formatName(first, last));
    }
    public static String formatName(String first, String last) {
        return last + " " + first ;

    }

}
