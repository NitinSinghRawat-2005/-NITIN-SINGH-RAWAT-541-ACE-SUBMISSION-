package easyTask2;

import java.util.*;

public class easyTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Questions
        String[] questions = {
                "1) What is the capital of India?",
                "2) Which language is used for Android development?",
                "3) Who has written the code?",
                "4) Which is the largest planet in our Solar System?",
                "5) Who is known as the father of Java?"
        };

        // Options
        String[][] options = {
                {"a) Delhi", "b) Mumbai", "c) Kolkata", "d) Chennai"},
                {"a) Python", "b) Java", "c) C", "d) Ruby"},
                {"a) Aryan", "b) Nitin", "c) Bhim", "d) Arpit"},
                {"a) Earth", "b) Mars", "c) Jupiter", "d) Saturn"},
                {"a) James Gosling", "b) Bill Gates", "c) Dennis Ritchie", "d) Elon Musk"}
        };

        // Correct answers
        char[] answers = {'a', 'b', 'b', 'c', 'a'};

        int score = 0;

        // Asking questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String opt : options[i]) {
                System.out.println(opt);
            }

            System.out.print("Your answer: ");
            char userAns = sc.next().toLowerCase().charAt(0);

            if (userAns == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer was: " + answers[i] + "\n");
            }
        }

        // Final score
        System.out.println("Quiz Over! Your score: " + score + "/" + questions.length);

        sc.close();
    }
}
