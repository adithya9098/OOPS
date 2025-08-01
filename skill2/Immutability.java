package stask2;

public class Immutability {
	public static void main(String[] args) {
        String original = "Hello";
        String modified = original.concat(" World");

        System.out.println("Original String: " + original);   // Hello
        System.out.println("Modified String: " + modified);   // Hello World
    }

}
