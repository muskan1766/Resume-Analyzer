import java.io.*;
import java.util.*;

public class Main {

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

        // Read files
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

        // Convert to sets
        Set<String> resumeSet = Analyzer.getUniqueWords(resumeWords);
        Set<String> jobSet = Analyzer.getUniqueWords(jobWords);

        // Print for now
        System.out.println("Resume Words: " + resumeSet);
        System.out.println("Job Keywords: " + jobSet);
    }
}