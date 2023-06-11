/*Write recursive function that takes an array of words and returns an array containing all words capitalized
i/p : ["foo", "bar", "world"]
o/p : ["FOO", "BAR", "WORLD"]*/

import java.util.Arrays;

public class Capiptal {
    public static String[] capitalizeWords(String[] words) {
        if (words.length == 0) {
            return new String[0];
        } else {
            String capitalizedWord = words[0].toUpperCase();
            String[] restOfWords = capitalizeWords(Arrays.copyOfRange(words, 1, words.length));
            String[] result = new String[restOfWords.length + 1];
            result[0] = capitalizedWord;
            System.arraycopy(restOfWords, 0, result, 1, restOfWords.length);
            return result;
        }
    }

    public static void main(String[] args) {
        String[] words = { "foo", "bar", "world" };
        String[] capitalizedWords = capitalizeWords(words);
        System.out.println(Arrays.toString(capitalizedWords));
    }
}
