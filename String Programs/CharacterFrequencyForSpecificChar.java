// Q: Find the frequncy of a given charactor in the String

import java.util.Scanner;

public class CharacterFrequencyForSpecificChar {

    public static void main(String[] args) {
        String input = "hello world";  // Example string

        // Get the character to check frequency for
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the character to find its frequency: ");
        char characterToCheck = scanner.next().charAt(0);
        
        // Call the function to find the frequency of the given character
        int frequency = findFrequency(input, characterToCheck);
        
        System.out.println("Frequency of '" + characterToCheck + "' in the string is: " + frequency);
        scanner.close();
    }

    // Function to find frequency of a specific character in the string
    public static int findFrequency(String str, char ch) {
        int frequency = 0;  // Initialize frequency count

        // Convert string to lowercase (optional, for case insensitivity)
        str = str.toLowerCase();
        ch = Character.toLowerCase(ch);  // Convert the character to lowercase

        // Traverse the string and count the occurrences of the given character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                frequency++;  // Increment the frequency when the character matches
            }
        }

        return frequency;  // Return the frequency count
    }
}
