import java.util.*;

class TextProcessor {

    public static String cleanText(String text) {
        return text.toLowerCase().replaceAll("[^a-zA-Z ]", "");
    }

    public static List<String> extractWords(String text) {
        String[] words = text.split("\\s+");
        return Arrays.asList(words);
    }
}