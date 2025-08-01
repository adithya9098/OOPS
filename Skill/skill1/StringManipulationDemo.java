package stringmanipulation;

public class StringManipulationDemo {

    public static void main(String[] args) {

        // String Immutability
        String original = "Hello";
        String modified = original.concat(" World");

        System.out.println("Original String: " + original);    // Output: Hello
        System.out.println("Modified String: " + modified);    // Output: Hello World

        // String is immutable: original string is unchanged
        System.out.println("Is original == modified? " + (original == modified)); // false

        // String Manipulation Methods
        String sample = "  Java Programming  ";
        
        System.out.println("Length: " + sample.length());
        System.out.println("Trimmed: '" + sample.trim() + "'");
        System.out.println("Uppercase: " + sample.toUpperCase());
        System.out.println("Lowercase: " + sample.toLowerCase());
        System.out.println("Substring (5, 16): " + sample.substring(5, 16));
        System.out.println("Replace 'a' with '@': " + sample.replace('a', '@'));
        System.out.println("Starts with '  Ja': " + sample.startsWith("  Ja"));
        System.out.println("Ends with 'g  ': " + sample.endsWith("g  "));
        System.out.println("Index of 'a': " + sample.indexOf('a'));
        System.out.println("Last Index of 'a': " + sample.lastIndexOf('a'));
        System.out.println("Char at index 6: " + sample.charAt(6));
        System.out.println("Equals 'java programming': " + sample.trim().equals("java programming")); // false
        System.out.println("EqualsIgnoreCase 'java programming': " + sample.trim().equalsIgnoreCase("java programming")); // true
    }
}
