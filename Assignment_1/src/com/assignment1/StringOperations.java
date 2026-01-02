package com.assignment1;

class StringOperations {

    public static void main(String[] args) {

        String text = " Hello Java World ";

        System.out.println("Length: " + text.length());
        System.out.println("Is Empty: " + text.isEmpty());
        System.out.println("CharAt(1): " + text.charAt(1));
        System.out.println("Equals: " + text.equals("Java"));
        System.out.println("Contains: " + text.contains("Java"));
        System.out.println("IndexOf: " + text.indexOf("Java"));
        System.out.println("StartsWith: " + text.startsWith(" "));
        System.out.println("EndsWith: " + text.endsWith(" "));
        System.out.println("Substring: " + text.substring(1, 5));
        System.out.println("LowerCase: " + text.toLowerCase());
        System.out.println("Trim: " + text.trim());
        System.out.println("Replace: " + text.replace("Java", "Core Java"));

        String[] words = text.trim().split(" ");
        for (String w : words)
            System.out.println(w);
    }
}
