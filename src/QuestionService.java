import java.util.Scanner;

class QuestionService {

    private final Question[] questions = new Question[5];
    private final Scanner input = new Scanner(System.in);
    private final String[] selection = new String[5];

    QuestionService() {
        this.questions[0] = new Question(1, "Size of int?", "2", "6", "4", "8", "4");
        this.questions[1] = new Question(2, "Size of double?", "2", "6", "4", "8", "8");
        this.questions[2] = new Question(3, "size of char?", "2", "6", "4", "8", "4");
        this.questions[3] = new Question(4, "Size of long?", "2", "6", "4", "8", "6");
        this.questions[4] = new Question(5, "Size of boolean?", "1", "6", "4", "8", "1");
    }

    void playQuiz() {
        int i = 0;
        for (final Question q : this.questions) {
            System.out.println("Question number: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.print(q.getOption1() + " ");
            System.out.print(q.getOption2() + " ");
            System.out.print(q.getOption3() + " ");
            System.out.println(q.getOption4() + " ");
            System.out.print("Your answer: ");
            this.selection[i] = this.input.nextLine();
            i++;
        }
        System.out.print("Your answers: ");
        for (final String s : this.selection) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    void displayQuestions() {
        for (final Question q : this.questions) {
            System.out.println(q.toString());
        }
    }

    void printScore() {
        int score = 0;

        for (int i = 0; i < this.questions.length; i++) {
            final Question que = this.questions[i];
            final String realAnswer = que.getAnswer();

            final String userAnswer = this.selection[i];

            if (realAnswer.equalsIgnoreCase(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is: " + score);
    }
}
