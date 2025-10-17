void main() {
    //    final QuestionService service = new QuestionService();
    //    service.displayQuestions();

    final Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a day of the week: ");
    final String response = scanner.nextLine()
                                   .toUpperCase();

    try {
        final Day day = Day.valueOf(response);

        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Its a weekday");
            case SATURDAY, SUNDAY -> System.out.println("Its a weekend");
        }
    } catch (final IllegalArgumentException e) {
        System.out.println("Not a valid day");
    }
    scanner.close();
}
