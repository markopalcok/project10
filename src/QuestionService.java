class QuestionService {

    private final Question[] questions = new Question[5];

    QuestionService() {
        this.questions[0] = new Question(1, "what", "a", "b", "c", "d", "answoer");
        this.questions[1] = new Question(2, "what2", "a", "b", "c", "d", "answoer2");
        this.questions[2] = new Question(3, "what3", "a", "b", "c", "d", "answoer3");
        this.questions[3] = new Question(4, "what4", "a", "b", "c", "d", "answoer4");
        this.questions[4] = new Question(5, "what5", "a", "b", "c", "d", "answoer5");
    }

    void displayQuestions() {
        for (final Question q : this.questions) {
            System.out.println(q.toString());
        }
    }

}
