package stask2;

public class Stringmethods {
	public static void main(String[] args) {
        String str = " Hello, World! ";

        // length() - Returns the length of the string
        System.out.println("Length: " + str.length());

        // trim() - Removes leading and trailing whitespace
        System.out.println("Trimmed: '" + str.trim() + "'");

        // toUpperCase() - Converts string to upper case
        System.out.println("Upper case: " + str.toUpperCase());

        // toLowerCase() - Converts string to lower case
        System.out.println("Lower case: " + str.toLowerCase());

        // substring(int beginIndex) - Returns substring from beginIndex to end
        System.out.println("Substring from index 7: " + str.substring(7));

        // substring(int beginIndex, int endIndex) - Returns substring between beginIndex and endIndex
        System.out.println("Substring from index 7 to 12: " + str.substring(7, 12));

        // contains(CharSequence s) - Checks if the string contains the specified sequence
        System.out.println("Contains 'World'? " + str.contains("World"));

        // replace(char oldChar, char newChar) - Replaces occurrences of oldChar with newChar
        System.out.println("Replace 'l' with 'x': " + str.replace('l', 'x'));

        // startsWith(String prefix) - Checks if string starts with prefix
        System.out.println("Starts with ' Hello'? " + str.startsWith(" Hello"));

        // endsWith(String suffix) - Checks if string ends with suffix
        System.out.println("Ends with '!'? " + str.endsWith("!"));

        // charAt(int index) - Returns character at specified index
        System.out.println("Character at index 1: " + str.charAt(1));

        // indexOf(String str) - Returns index of first occurrence of str
        System.out.println("Index of 'o': " + str.indexOf("o"));

        // equals(Object anObject) - Checks if strings are equal
        System.out.println("Equals ' Hello, World! '? " + str.equals(" Hello, World! "));

        // equalsIgnoreCase(String anotherString) - Checks equality ignoring case
        System.out.println("EqualsIgnoreCase ' hello, world! '? " + str.equalsIgnoreCase(" hello, world! "));
    }
}
