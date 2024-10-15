public class VowelCount {
    public static void main(String[] args) {
        String str = "Programming is fun!";
        int vowelCount = 0;
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(str.charAt(i)) {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
    }
}
