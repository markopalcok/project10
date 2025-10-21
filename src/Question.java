class Question {

    private int id;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String answer;

    Question(final int id, final String question, final String option1, final String option2, final String option3, final String option4, final String answer) {
        this.id = id;
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
    }

    int getId() {
        return this.id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    String getQuestion() {
        return this.question;
    }

    public void setQuestion(final String question) {
        this.question = question;
    }

    String getOption1() {
        return this.option1;
    }

    public void setOption1(final String option1) {
        this.option1 = option1;
    }

    String getOption2() {
        return this.option2;
    }

    public void setOption2(final String option2) {
        this.option2 = option2;
    }

    String getOption3() {
        return this.option3;
    }

    public void setOption3(final String option3) {
        this.option3 = option3;
    }

    String getOption4() {
        return this.option4;
    }

    public void setOption4(final String option4) {
        this.option4 = option4;
    }

    String getAnswer() {
        return this.answer;
    }

    public void setAnswer(final String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" + "id=" + this.id + ", question='" + this.question + '\'' + ", option1='" + this.option1 + '\'' + ", option2='" + this.option2 + '\'' + ", option3='" + this.option3 + '\''
               + ", option4='" + this.option4 + '\'' + ", answer='" + this.answer + '\'' + '}';
    }

}
