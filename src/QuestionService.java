import java.util.Scanner;

public class QuestionService{
    Question[] questions = new Question[5];
    Scanner input = new Scanner(System.in);
    String[] selection = new String[5];

    QuestionService(){
        questions[0] = new Question(1, "Size of int?", "2", "6","4","8", "4");
        questions[1] = new Question(2, "Size of double?", "2", "6","4","8", "8");
        questions[2] = new Question(3, "size of char?", "2", "6","4","8", "4");
        questions[3] = new Question(4, "Size of long?", "2", "6","4","8", "6");
        questions[4] = new Question(5, "Size of boolean?", "1", "6","4","8", "1");
    }

    public void playQuiz() {
        int i = 0;
        for(Question q : questions){
            System.out.println("Question number: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.print(q.getOption1() + " ");
            System.out.print(q.getOption2() + " ");
            System.out.print(q.getOption3() + " ");
            System.out.println(q.getOption4() + " ");
            System.out.print("Your answer: ");
            selection[i] = input.nextLine();
            i++;
        }
        System.out.println("Your answers: ");
        for(String s : selection){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public void printScore(){
        int score = 0;

        for(int i = 0; i< questions.length;i++){
            Question que = questions[i];
            String realAnswer = que.getAnswer();

            String userAnswer = selection[i];

            if(realAnswer.equalsIgnoreCase(userAnswer)){
                score++;
            }
        }
        System.out.println("Your score is: " + score);
    }

}
