import java.util.*;

class Analyzer {

    public static Set<String> getUniqueWords(List<String> words) {
        return new HashSet<>(words);
    }

    public static int calculateScore(Set<String> jobSet, Set<String> resumeSet) {
        int matchCount = 0;

        for (String word : jobSet) {
            if (resumeSet.contains(word)) {
                matchCount++;
            }
        }

        return (matchCount * 100) / jobSet.size();
    }

    public static List<String> getMatched(Set<String> jobSet, Set<String> resumeSet) {
        List<String> matched = new ArrayList<>();

        for (String word : jobSet) {
            if (resumeSet.contains(word)) {
                matched.add(word);
            }
        }

        return matched;
    }

    public static List<String> getMissing(Set<String> jobSet, Set<String> resumeSet) {
        List<String> missing = new ArrayList<>();

        for (String word : jobSet) {
            if (!resumeSet.contains(word)) {
                missing.add(word);
            }
        }

        return missing;
    }
}