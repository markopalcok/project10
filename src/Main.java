public class Main {
    public static void main(String[] args){
        QuestionService service = new QuestionService();
        service.playQuiz();
        service.printScore();

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();

        fish.flee();
        fish.hunt();

        Machine fan = new Fan("Fan");
        Machine wm = new WashingMachine("Washing Machine");

        System.out.println(fan.start());
        System.out.println(wm.start());
    }
}
