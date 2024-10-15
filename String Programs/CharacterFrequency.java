// Q: Find the frequncy of all the charactors in the given String

public class CharacterFrequency {

    public static void main(String[] args) {
        String input = "hello world";  // Example string
        findFrequency(input);
    }

    // Function to find frequency of characters without using built-in functions
    public static void findFrequency(String str) {
        int[] frequency = new int[256];  // Assuming ASCII characters (256 possible characters)

        // Convert string to lowercase (optional, for case insensitivity)
        str = str.toLowerCase();

        // Traverse the string and manually count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {  // Skip spaces (optional)
                frequency[ch]++;  // Increment the count of the character
            }
        }

        // Display the frequency of each character
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {  // If the character appeared in the string
                System.out.println((char)i + ": " + frequency[i]);
            }
        }
    }
}
