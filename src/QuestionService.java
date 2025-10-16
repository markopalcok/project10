public class QuestionService{
    Question[] questions = new Question[5];

    QuestionService(){
        questions[0] = new Question(1, "what", "a", "b","c","d", "answoer");
        questions[1] = new Question(2, "what2", "a", "b","c","d", "answoer2");
        questions[2] = new Question(3, "what3", "a", "b","c","d", "answoer3");
        questions[3] = new Question(4, "what4", "a", "b","c","d", "answoer4");
        questions[4] = new Question(5, "what5", "a", "b","c","d", "answoer5");
    }

    public void displayQuestions(){
        for(Question q : questions){
            System.out.println(q.toString());
        }
    }

}
