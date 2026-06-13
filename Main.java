import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      QUIZ APPLICATION");
        System.out.println("=================================");

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        Quiz quiz = new Quiz();

        int score = quiz.conductQuiz(scanner);

        int total = quiz.getTotalQuestions();

        int incorrect = total - score;

        double percentage = ((double) score / total) * 100;

        System.out.println("\n=================================");
        System.out.println("         QUIZ COMPLETED");
        System.out.println("=================================");
        System.out.println("Name       : " + name);
        System.out.println("Score      : " + score + "/" + total);
        System.out.println("Correct    : " + score);
        System.out.println("Incorrect  : " + incorrect);
        System.out.printf("Percentage : %.2f%%\n", percentage);

        if (percentage >= 80) {
            System.out.println("Excellent Work!");
        } else if (percentage >= 60) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }

        ResultManager.saveResult(name, score, total);

        System.out.println("\nResult saved successfully to results.txt");

        scanner.close();
    }
}