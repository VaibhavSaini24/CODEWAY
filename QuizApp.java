import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApp {
    static int seconds = 0;
    static Timer timer = new Timer();
    static Scanner scanner = new Scanner(System.in);
    static int score = 0;

    public static void main(String[] args) {
        startQuiz();
    }

    public static void startQuiz() {
        System.out.println("Welcome to the Quiz App!");
        System.out.println("Press Enter to start the quiz...");
        scanner.nextLine(); // Wait for user input

        // Start the timer
        TimerTask task = new TimerTask() {
            public void run() {
                seconds++;
                System.out.println("Time elapsed: " + seconds + " seconds");
            }
        };
        timer.schedule(task, 1000, 1000); // Run every second

        // Display questions
        askQuestion("What is the capital of France?", "A. Paris", "B. London", "C. Berlin", "A");
        askQuestion("Which planet is known as the Red Planet?", "A. Earth", "B. Mars", "C. Venus", "B");
        askQuestion(" What is the largest ocean in the world?", "A. Atlantic Ocean", "B.Indian Ocean", "C. Pacific Ocean", "C");
        askQuestion("Which country is known as the Land of the Rising Sun?", "A. China", "B. India", "C. Japan", "C");
        askQuestion("What is the tallest mountain in the world?", "A. Mount Mckinley", "B. Mount Everest", "C. Mount Fuji", "B");
        
        // Display final score
        System.out.println("\nQuiz completed!");
        System.out.println("Your score: " + score + " out of 5");
        timer.cancel(); // Stop the timer
    }

    public static void askQuestion(String question, String optionA, String optionB, String optionC, String correctAnswer) {
        System.out.println("\n" + question);
        System.out.println(optionA);
        System.out.println(optionB);
        System.out.println(optionC);
        System.out.print("Your answer (A/B/C): ");
        String userAnswer = scanner.nextLine();

        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect!");
        }
    }
}


