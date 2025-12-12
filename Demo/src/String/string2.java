package String;

import java.util.Arrays;

public class string2 {

    // Standard main method structure
    public static void main(String[] args) {

        // --- SETUP ---
        // StringBuilder: Mutable (modifiable), creates object in Heap.
        StringBuilder sb = new StringBuilder("abc");

        // String: Immutable (cannot change), creates object in Heap (due to 'new').
        String s = new String("abc");

        System.out.println(s);  // Output: abc
        System.out.println(sb); // Output: abc


        // --- BASIC CHECKS ---
        // .length(): Returns the count of characters.
        System.out.println("String length :" + s.length());
        // Output: String length :3

        // .isEmpty(): Returns true if length is 0.
        System.out.println("Is string empty :" + s.isEmpty());
        // Output: Is string empty :false


        // --- PREFIX & SUFFIX CHECKS ---
        // .startsWith(prefix): Checks if string begins with specific characters.
        System.out.println("Starts with a :" + s.startsWith("a"));
        // Output: Starts with a :true

        System.out.println("Starts with ab :" + s.startsWith("ab"));
        // Output: Starts with ab :true

        System.out.println("Starts with s :" + s.startsWith("s"));
        // Output: Starts with s :false

        // .endsWith(suffix): Checks if string ends with specific characters.
        System.out.println("Ends with a :" + s.endsWith("a"));
        // Output: Ends with a :false

        System.out.println("Ends with bc :" + s.endsWith("bc"));
        // Output: Ends with bc :true


        // --- EQUALITY (The Important Part) ---
        // 1. .equals(Object): Expects a String.
        // FAILS here because 'sb' is a StringBuilder, not a String.
        // It checks type first -> Type doesn't match -> Returns false immediately.
        System.out.println("is equal with sb :" + s.equals(sb));
        // Output: is equal with sb :false

        // 2. .equals(toString):
        // We convert sb to String first. Now types match ("abc" vs "abc").
        System.out.println("is equal with sb.toString :" + s.equals(sb.toString()));
        // Output: is equal with sb.toString :true

        // 3. .contentEquals(CharSequence):
        // The BEST way to compare String vs StringBuilder.
        // It checks the actual text content regardless of the object type.
        System.out.println("is equal with contentEquals :" + s.contentEquals(sb));
        // Output: is equal with contentEquals :true


        // --- MANIPULATION & SEARCH ---
        String ss = "racecar is good";

        // 1. toCharArray(): Converts string to a character array.
        // Essential for swapping characters or sorting in DSA.
        char[] arr = ss.toCharArray();
        System.out.println(Arrays.toString(arr));
        // Output: [r, a, c, e, c, a, r,  , i, s,  , g, o, o, d]

        // 2. charAt(index): specific character at index 4 (0-based: r,a,c,e,c).
        System.out.println(ss.charAt(4));
        // Output: c

        // 3. substring(start, end):
        // Start (1) is INCLUSIVE. End (4) is EXCLUSIVE.
        // Indices: 0(r) 1(a) 2(c) 3(e) 4(c)... -> grabs 1,2,3
        String sub = ss.substring(1, 4);
        System.out.println(sub);
        // Output: ace

        // 4. substring(start): Returns everything from index 2 to the end.
        System.out.println(ss.substring(2));
        // Output: cecar is good

        // 5. indexOf / lastIndexOf:
        // indexOf: First occurrence of 'c' (at index 2)
        System.out.println(ss.indexOf('c'));
        // Output: 2

        // lastIndexOf: Last occurrence of 'a' (at index 5)
        System.out.println(ss.lastIndexOf('a'));
        // Output: 5

        // 6. concat(): Joins strings.
        // Note: This returns a NEW string. 'ss' itself is NOT changed (Immutability).
        System.out.println(ss.concat("skdfjk"));
        // Output: racecar is goodskdfjk

        // 7. replace(target, replacement): Replaces all occurrences.
        String sss = ss.replace("good", "amazing");
        System.out.println(sss);
        // Output: racecar is amazing

        // 8. toUpperCase(): Converts all chars to upper case.
        System.out.println(sss.toUpperCase());
        // Output: RACECAR IS AMAZING

        // 9. split(regex): Splits string into an array based on Space " ".
        System.out.println(Arrays.toString(sss.split(" ")));
        // Output: [racecar, is, amazing]
    }
}