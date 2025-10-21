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

    final List<String> listNames = Arrays.asList("Alice", "Bob", "Alice", "David", "Bob");
    System.out.println("Original list: " + listNames);
    final Set<String> setNames = new LinkedHashSet<>(listNames);
    System.out.println("Unique Names: " + setNames);

    final Map<String, Integer> students = new HashMap<>();
    students.put("Mirko", 50);
    students.put("Slavko", 540);
    students.put("Duro", 5);

    System.out.println(students.keySet());

    for (final String name2 : students.keySet()) {
        System.out.println(name2 + " " + students.get(name2));
    }

    final List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");
    System.out.println("Original List: " + products);
    final List<String> prodictsUpper = products.stream()
                                               .map(String::toUpperCase)
                                               .filter(count -> count.length() > 3)
                                               .sorted()
                                               .toList();
    System.out.println("Filtered Products: " + prodictsUpper);

    scanner.close();
}
