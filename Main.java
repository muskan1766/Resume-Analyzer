import java.io.*;
import java.util.*;

public class Main {

    // Function to read file content
    public static String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append(" ");
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return content.toString();
    }

    public static void main(String[] args) {

        // Read input files
        String resumeText = readFile("resume.txt");
        String jobText = readFile("job.txt");

        // Create objects
        Resume resume = new Resume(resumeText);
        JobDescription job = new JobDescription(jobText);

        // Clean text
        String cleanResume = TextProcessor.cleanText(resume.content);
        String cleanJob = TextProcessor.cleanText(job.content);

        // Extract words
        List<String> resumeWords = TextProcessor.extractWords(cleanResume);
        List<String> jobWords = TextProcessor.extractWords(cleanJob);

        // Convert to sets (unique words)
        Set<String> resumeSet = Analyzer.getUniqueWords(resumeWords);
        Set<String> jobSet = Analyzer.getUniqueWords(jobWords);

        // Perform analysis
        int score = Analyzer.calculateScore(jobSet, resumeSet);
        List<String> matched = Analyzer.getMatched(jobSet, resumeSet);
        List<String> missing = Analyzer.getMissing(jobSet, resumeSet);

        // Display results
        System.out.println("\n===== Resume Analysis Result =====");

        System.out.println("\nScore: " + score + "%");

        System.out.println("\nMatched Keywords:");
        for (String word : matched) {
            System.out.println("[MATCHED] " + word);
        }

        System.out.println("\nMissing Keywords:");
        for (String word : missing) {
            System.out.println("[MISSING] " + word);
        }
    }
}