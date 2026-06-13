import java.io.FileWriter;
import java.io.IOException;

public class ResultManager {

    public static void saveResult(String name, int score, int totalQuestions) {
        double percentage = ((double) score / totalQuestions) * 100;

        try (FileWriter writer = new FileWriter("results.txt", true)) {

            writer.write("Name: " + name + "\n");
            writer.write("Score: " + score + "/" + totalQuestions + "\n");
            writer.write("Percentage: " + String.format("%.2f", percentage) + "%\n");
            writer.write("---------------------------------\n");

        } catch (IOException e) {
            System.out.println("Error saving result.");
        }
    }
}