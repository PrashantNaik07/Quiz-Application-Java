import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;

        loadQuestions();
    }

    private void loadQuestions() {

        questions.add(new Question(
                "1. Which keyword is used to inherit a class in Java?",
                new String[]{"A. implement", "B. inherit", "C. extends", "D. super"},
                'C'));

        questions.add(new Question(
                "2. Which method is the entry point of a Java program?",
                new String[]{"A. start()", "B. run()", "C. execute()", "D. main()"},
                'D'));

        questions.add(new Question(
                "3. Which of the following is NOT a primitive data type in Java?",
                new String[]{"A. int", "B. float", "C. String", "D. boolean"},
                'C'));

        questions.add(new Question(
                "4. Which collection allows duplicate elements?",
                new String[]{"A. Set", "B. HashSet", "C. TreeSet", "D. ArrayList"},
                'D'));

        questions.add(new Question(
                "5. Which operator is used to compare two values in Java?",
                new String[]{"A. =", "B. ==", "C. !=", "D. equals"},
                'B'));

        questions.add(new Question(
                "6. What does CPU stand for?",
                new String[]{"A. Central Process Unit", "B. Computer Processing Unit",
                        "C. Central Processing Unit", "D. Control Processing Unit"},
                'C'));

        questions.add(new Question(
                "7. Which device is used to permanently store data?",
                new String[]{"A. RAM", "B. Cache", "C. Hard Disk", "D. Register"},
                'C'));

        questions.add(new Question(
                "8. What does RAM stand for?",
                new String[]{"A. Random Access Memory", "B. Read Access Memory",
                        "C. Rapid Access Memory", "D. Run Access Memory"},
                'A'));

        questions.add(new Question(
                "9. Which of the following is an Operating System?",
                new String[]{"A. MS Word", "B. Windows", "C. Chrome", "D. Photoshop"},
                'B'));

        questions.add(new Question(
                "10. Which network covers a small geographical area?",
                new String[]{"A. WAN", "B. MAN", "C. LAN", "D. PAN"},
                'C'));
    }

    public int conductQuiz(Scanner scanner) {

        for (Question question : questions) {

            System.out.println("\n" + question.getQuestionText());

            for (String option : question.getOptions()) {
                System.out.println(option);
            }

            char answer;

            while (true) {
                System.out.print("Your Answer (A/B/C/D): ");
                String input = scanner.nextLine().trim().toUpperCase();

                if (input.matches("[ABCD]")) {
                    answer = input.charAt(0);
                    break;
                }

                System.out.println("Invalid input! Please enter A, B, C, or D.");
            }

            if (answer == question.getCorrectAnswer()) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong!");
                System.out.println("Correct Answer: " + question.getCorrectAnswer());
            }
        }

        return score;
    }

    public int getTotalQuestions() {
        return questions.size();
    }
}