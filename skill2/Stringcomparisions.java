package stask2;

public class Stringcomparisions {
	public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = "hello";

        // 1. Using == operator (compares references)
        System.out.println("str1 == str2: " + (str1 == str2)); // true, same string pool object
        System.out.println("str1 == str3: " + (str1 == str3)); // false, different objects

        // 2. Using equals() method (compares content)
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true

        // 3. Using equalsIgnoreCase() method (case-insensitive comparison)
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); // true

        // 4. Using compareTo() method (lexicographical comparison)
        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4)); // negative value due to case difference
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // 0, strings are equal
    }

}
