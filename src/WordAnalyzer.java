public class WordAnalyzer {

    public static boolean isSingleWord(String word) {
        return !word.contains(" ");
    }

    public static boolean isReverse(String w1, String w2) {
        return new StringBuilder(w1)
                .reverse()
                .toString()
                .equalsIgnoreCase(w2);
    }

    public static String transform(String word) {
        return word.toLowerCase().replaceAll("[aeiou]", "*");
    }

    public static String combine(String w1, String w2) {
        return (w1 + w2).toUpperCase();
    }

    public static int countVowels(String word) {
        int count = 0;
        for (char ch : word.toCharArray()) {
            if ("AEIOU".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    public static int countConsonants(String word) {
        int count = 0;
        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch) && "AEIOU".indexOf(ch) == -1) {
                count++;
            }
        }
        return count;
    }

    public static String uniqueChars(String word) {
        String result = "";
        for (char ch : word.toCharArray()) {
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        return result;
    }
}
