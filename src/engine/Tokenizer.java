package engine;

/**
 * Used to tokenize text
 */

public class Tokenizer {
    public static String[] tokenize(String text){
        text = text.toLowerCase();
        text = text.replaceAll("[^a-z0-9 ]", " ");

        return text.split("\\\\s+");
    }
}
