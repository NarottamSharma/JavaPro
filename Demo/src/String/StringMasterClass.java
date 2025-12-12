package String;

public class StringMasterClass {

    public static void main(String[] args) {
        // Part 1: Run the Concept Demonstrations
        runConceptChecks();

        // Part 2: Run the Speed Test
        runSpeedTest();
    }

    // ==========================================
    // METHOD 1: CONCEPTS (SCP, Heap, Immutability)
    // ==========================================
    public static void runConceptChecks() {
        System.out.println("=== PART 1: CONCEPT CHECKS ===");

        // --- 1. Memory Locations (SCP vs Heap) ---
        System.out.println("\n--- 1. Memory Locations ---");

        // Case A: Literals (Stored in String Constant Pool)
        String s1 = "Hello";
        String s2 = "Hello";

        // Case B: 'new' Keyword (Stored in Main Heap)
        // FIX: Must use 'new String' to force a different memory address
        String s3 = new String("Hello");

        System.out.println("s1 == s2? " + (s1 == s2)); // true (Same object in SCP)
        System.out.println("s1 == s3? " + (s1 == s3)); // false (Different object in Heap)


        // --- 2. Proving Immutability (String) ---
        System.out.println("\n--- 2. Immutability of String ---");
        String str = "Java";
        System.out.println("Original String Address: " + System.identityHashCode(str));

        str = str + " Programming"; // Creates NEW object
        System.out.println("New String Address:      " + System.identityHashCode(str));
        // Result: Addresses are DIFFERENT


        // --- 3. Proving Mutability (StringBuffer) ---
        System.out.println("\n--- 3. Mutability of StringBuffer ---");
        StringBuffer sb = new StringBuffer("Java");
        System.out.println("Original Buffer Address: " + System.identityHashCode(sb));

        sb.append(" Programming"); // Modifies SAME object
        System.out.println("New Buffer Address:      " + System.identityHashCode(sb));
        // Result: Addresses are SAME


        // --- 4. StringBuilder Utility ---
        System.out.println("\n--- 4. StringBuilder Usage ---");
        StringBuilder sBuilder = new StringBuilder("Hello");
        sBuilder.reverse();
        System.out.println("Reversed: " + sBuilder);
    }

    // ==========================================
    // METHOD 2: SPEED TEST (String vs StringBuilder)
    // ==========================================
    public static void runSpeedTest() {
        System.out.println("\n\n=== PART 2: SPEED TEST ===");

        int iterations = 100000;

        // --- TEST A: Using String (Slow) ---
        long startTime = System.currentTimeMillis();
        String s = "";
        for(int i = 0; i < iterations; i++) {
            s = s + "a"; // Creates 100,000 new objects!
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String Time:        " + (endTime - startTime) + "ms");


        // --- TEST B: Using StringBuilder (Fast) ---
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < iterations; i++) {
            sb.append("a"); // Updates 1 object 100,000 times
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + "ms");
    }
}