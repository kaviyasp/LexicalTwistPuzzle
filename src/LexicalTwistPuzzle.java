import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Lexical Twist Puzzle");

        System.out.print("Enter first word: ");
        String word1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String word2 = sc.nextLine();

        if (word1.contains(" ") || word2.contains(" ")) {
            System.out.println("Invalid input.");
            sc.close();
            return;
        }

        String reversed = new StringBuilder(word1).reverse().toString();

        if (reversed.equalsIgnoreCase(word2)) {

            String transformed = word1
                    .toLowerCase()
                    .replaceAll("[aeiou]", "*");

            System.out.println("Transformed word: " + transformed);

        } else {

            String combined = (word1 + word2).toUpperCase();

            int vowels = 0;
            int consonants = 0;

            for (char ch : combined.toCharArray()) {
                if ("AEIOU".indexOf(ch) != -1) {
                    vowels++;
                } else if (Character.isLetter(ch)) {
                    consonants++;
                }
            }

            String unique = "";
            for (char ch : combined.toCharArray()) {
                if (unique.indexOf(ch) == -1) {
                    unique += ch;
                }
            }

            System.out.println("Combined Word: " + combined);
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Unique Characters: " + unique);
        }

        sc.close();
    }
}
