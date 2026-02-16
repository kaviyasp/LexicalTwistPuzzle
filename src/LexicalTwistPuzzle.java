import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Lexical Twist Puzzle");

        System.out.print("Enter first word: ");
        String word1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String word2 = sc.nextLine();

        if (!WordAnalyzer.isSingleWord(word1) ||
                !WordAnalyzer.isSingleWord(word2)) {

            System.out.println("Invalid input.");
            sc.close();
            return;
        }

        if (WordAnalyzer.isReverse(word1, word2)) {

            System.out.println(
                    "Transformed word: "
                            + WordAnalyzer.transform(word1)
            );

        } else {

            String combined =
                    WordAnalyzer.combine(word1, word2);

            System.out.println("Combined Word: " + combined);
            System.out.println("Vowels: "
                    + WordAnalyzer.countVowels(combined));
            System.out.println("Consonants: "
                    + WordAnalyzer.countConsonants(combined));
            System.out.println("Unique Characters: "
                    + WordAnalyzer.uniqueChars(combined));
        }

        sc.close();
    }
}
