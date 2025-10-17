void main() {
    //    final QuestionService service = new QuestionService();
    //    service.displayQuestions();

    final Scanner scanner = new Scanner(System.in);
    //    System.out.print("Enter a day of the week: ");
    //    final String response = scanner.nextLine()
    //                                   .toUpperCase();
    //
    //    try {
    //        final Day day = Day.valueOf(response);
    //
    //        switch (day) {
    //            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Its a weekday");
    //            case SATURDAY, SUNDAY -> System.out.println("Its a weekend");
    //        }
    //    } catch (final IllegalArgumentException e) {
    //        System.out.println("Not a valid day");
    //    }

    //    final ArrayList<Integer> numbers = new ArrayList<>();
    //    numbers.add(5);
    //    numbers.add(2);
    //    numbers.add(5);
    //    numbers.add(8);
    //    numbers.forEach((n) -> {System.out.print(n + " ");});   //statement lambda
    //    numbers.forEach((n) -> System.out.print(n + " "));      //expression lambda

    //    try {
    //        System.out.print("Enter a number: ");
    //        final int number = scanner.nextInt();
    //        System.out.println(number);
    //    } catch (final InputMismatchException e) {
    //        System.out.println("That was not a number");
    //    } catch (final ArithmeticException e) {
    //        System.out.println("Can't divide by zero");
    //    } catch (final Exception e) {
    //        System.out.println("Something went wrong");
    //    }

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
