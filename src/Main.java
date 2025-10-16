public class Main {
    public static void main(String[] args){
//        QuestionService service = new QuestionService();
//        service.playQuiz();
//        service.printScore();

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();

        fish.flee();
        fish.hunt();

    }
}
