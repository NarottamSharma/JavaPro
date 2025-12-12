package String;

import java.util.Scanner;

public class string3buffer {
    static void main() {
        StringBuffer sb = new StringBuffer("welcome");
        IO.println(sb.append(" narottam"));
        sb.setCharAt(3, 'u'); // Modify it first
        System.out.println(sb);      // Then print the object
        sb.deleteCharAt(3);
        System.out.println(sb);
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();

        StringBuffer sb1 = new StringBuffer("Welcome");
        System.out.println("Original Buffer: " + sb1);
        // Output: Original Buffer: Welcome

        // 1. Appending a String
        sb1.append(" to Java.");
        System.out.println("After append(String): " + sb1);
        // Output: After append(String): Welcome to Java.

        // 2. Appending an integer (automatically converts it to a String)
        sb1.append(2025);
        System.out.println("After append(int): " + sb1);
        // Output: After append(int): Welcome to Java.2025

        // 3. Appending a character
        sb1.append('!');
        System.out.println("After append(char): " + sb1);
        // Output: After append(char): Welcome to Java.2025!

        // 4. Chaining append calls (The returned value is the object itself)
        sb1.append(" Final").append(" String.");
        System.out.println("After Chaining: " + sb1);
        // Output: After Chaining: Welcome to Java.2025! Final String.

        StringBuffer sb2 = new StringBuffer("Java is awesome.");
        System.out.println("Original Buffer: " + sb2);
        // Output: Original Buffer: Java is awesome.

        // 1. Inserting a word at the beginning (index 0)
        sb2.insert(0, "Learning ");
        System.out.println("After insert(0, ...): " + sb2);
        // Output: After insert(0, ...): Learning Java is awesome.

        // 2. Inserting a word in the middle (at index 9 - just before 'J')
        // J is now at index 9: L e a r n i n g [space]
        sb2.insert(9, "Programming ");
        System.out.println("After insert(9, ...): " + sb2);
        // Output: After insert(9, ...): Learning Programming Java is awesome.

        // 3. Inserting a boolean value (at the very end, which is index 42 now)
        sb2.insert(sb2.length(), true);
        System.out.println("After insert(length, ...): " + sb2);
        // Output: After insert(length, ...): Learning Programming Java is awesome.true

    }
}
