void main() {

    final QuestionService service = new QuestionService();
    service.playQuiz();
    service.printScore();

    final Rabbit rabbit = new Rabbit();
    final Hawk hawk = new Hawk();
    final Fish fish = new Fish();

    rabbit.flee();
    hawk.hunt();

    fish.flee();
    fish.hunt();

    final Machine fan = new Fan("Fan");
    final Machine wm = new WashingMachine("Washing Machine");

    IO.println(fan.start());
    IO.println(wm.start());
}
