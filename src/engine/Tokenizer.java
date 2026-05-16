package engine;

/**
 * Used to tokenize text
 */

public class Tokenizer {

    /**
     * Method to split text into words by removing punctuation and ignores cases
     *
     * @param text input
     * @return array of words
     */

    public static String[] tokenize(String text){
        text = text.toLowerCase();
        text = text.replaceAll("[^a-z0-9 ]", " ");

        return text.split("\\s+");
    }
}
