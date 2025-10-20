void main() {
    final QuestionService service = new QuestionService();
    service.displayQuestions();

    final List<String> listNames = Arrays.asList("Alice", "Bob", "Alice", "David", "Bob");
    System.out.println("Original list: " + listNames);
    final Set<String> setNames = new LinkedHashSet<>(listNames);
    System.out.println("Unique Names: " + setNames);

    final Map<String, Integer> students = new HashMap<>();
    students.put("Mirko", 50);
    students.put("Slavko", 540);
    students.put("Duro", 5);

    System.out.println(students.keySet());

    for (final String name : students.keySet()) {
        System.out.println(name + " " + students.get(name));
    }

    final List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");
    System.out.println("Original List: " + products);
    final List<String> prodictsUpper = products.stream()
                                               .map(String::toUpperCase)
                                               .filter(count -> count.length() > 3)
                                               .sorted()
                                               .toList();
    System.out.println("Filtered Products: " + prodictsUpper);

}
