void main() {

    final Scanner scanner = new Scanner(System.in);
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

    System.out.print("Ender age of man: ");
    final int newAge = scanner.nextInt();

    final Human man1 = new Human(newAge);

    try {
        man1.checkAge();
    } catch (final InvalidAgeException e) {
        System.out.println("Invalid: " + e.getMessage());
    }

    final MyRunnable myrunnable = new MyRunnable();
    final Thread thread = new Thread(myrunnable);

    thread.setDaemon(true);
    thread.start();

    System.out.println("----------------------------------");
    System.out.println("You have 10 seconds to enter your name. ");
    System.out.print("Enter your name: ");

    final String name = scanner.nextLine();
    System.out.println("Hello " + name);

    scanner.close();
}
