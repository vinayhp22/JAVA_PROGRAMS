public class SwapCase {
    public static void main(String[] args) {
        String input = "Hello World!";  // Example input string
        String result = swapCase(input);
        System.out.println("Original: " + input);
        System.out.println("Swapped: " + result);
    }

    public static String swapCase(String str) {
        StringBuilder swapped = new StringBuilder(str.length());

        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                // Convert uppercase to lowercase by adding 32
                swapped.append((char)(c + 32));
            } else if (c >= 'a' && c <= 'z') {
                // Convert lowercase to uppercase by subtracting 32
                swapped.append((char)(c - 32));
            } else {
                // Non-alphabetical characters remain unchanged
                swapped.append(c);
            }
        }

        return swapped.toString();
    }
}
