import java.util.*;

class TextProcessor {

    // Stop words list
    private static final Set<String> stopWords = new HashSet<>(Arrays.asList(
        "the", "is", "and", "of", "to", "in", "for", "on", "with", "a", "an"
    ));

    public static String cleanText(String text) {
        return text.toLowerCase().replaceAll("[^a-zA-Z ]", "");
    }

    public static List<String> extractWords(String text) {
        String[] words = text.split("\\s+");
        List<String> filtered = new ArrayList<>();

        for (String word : words) {
            if (!stopWords.contains(word) && !word.isEmpty()) {
                filtered.add(word);
            }
        }

        return filtered;
    }
}