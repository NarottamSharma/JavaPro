package String;


public class SpeedTest {

        int iterations = 100000;

        // --- TEST 1: Using String (Bad for loops) ---
        long startTime = System.currentTimeMillis();
        String s = "";
        for(int i = 0; i < iterations; i++) {
            s = s + "a"; // Creates a NEW object 100,000 times!
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String time: " + (endTime - startTime) + "ms");


        // --- TEST 2: Using StringBuilder (Good for loops) ---
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < iterations; i++) {
            sb.append("a"); // Modifies the SAME object 100,000 times
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (endTime - startTime) + "ms");

}

public class Main {
    static void main(String[] args) {

        // ==========================================
        // 1. STRING CONSTANT POOL (SCP) vs HEAP
        // ==========================================
        System.out.println("--- 1. Memory Locations ---");

        // Case A: Literals (Stored in SCP)
        // Java sees "Hello" is already in SCP, so s1 and s2 point to the SAME spot.
        String s1 = "Hello";
        String s2 = "Hello";

        // Case B: 'new' Keyword (Stored in Heap)
        // Forces a NEW object in Heap, even though content is same.
        String s3 = "Hello";

        System.out.println("s1 == s2? " + (s1 == s2)); // true (Same memory)
        System.out.println("s1 == s3? " + (s1 == s3)); // false (Different memory)


        // ==========================================
        // 2. PROVING IMMUTABILITY (String)
        // ==========================================
        System.out.println("\n--- 2. Immutability of String ---");

        String str = "Java";
        // Let's check the memory address BEFORE change
        System.out.println("Original Address: " + System.identityHashCode(str));

        str = str + " Programming";
        // We 'changed' the string, but look at the address now:
        System.out.println("New Address:      " + System.identityHashCode(str));

        // RESULT: The addresses are DIFFERENT.
        // Java didn't change "Java"; it created a whole new object "Java Programming"
        // and threw the old one away. This is why String is SLOW for loops.


        // ==========================================
        // 3. PROVING MUTABILITY (StringBuffer/Builder)
        // ==========================================
        System.out.println("\n--- 3. Mutability of StringBuffer ---");

        StringBuffer sb = new StringBuffer("Java");
        // Check memory address BEFORE change
        System.out.println("Original Address: " + System.identityHashCode(sb));

        sb.append(" Programming");
        // Check memory address AFTER change
        System.out.println("New Address:      " + System.identityHashCode(sb));

        // RESULT: The addresses are the SAME.
        // Java modified the original object directly. Much faster.


        // ==========================================
        // 4. STRING BUILDER (The Fast One)
        // ==========================================
        // Exactly like StringBuffer, but not 'Synchronized' (Not thread-safe).
        // Use this 90% of the time in non-threaded apps.
        StringBuilder sBuilder = new StringBuilder("Hello");
        sBuilder.reverse(); // Easy utility methods
        System.out.println("\n--- 4. StringBuilder Output ---");
        System.out.println("Reversed: " + sBuilder);
    }
}