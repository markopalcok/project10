void main() {
    //    final QuestionService service = new QuestionService();
    //    service.displayQuestions();

    List<String> listNames = Arrays.asList("Alice", "Bob", "Alice", "David", "Bob");
    System.out.println("Original list: " + listNames);
    Set<String> setNames = new HashSet<>(listNames);
    System.out.println("Unique Names: " + setNames);


//    Map<String, Integer> students = new HashMap<>();
//    students.put("Mirko", 50);
//    students.put("Slavko", 540);
//    students.put("Duro", 5);
//
//    System.out.println(students.keySet());
//
//    for (String name : students.keySet()) {
//        System.out.println(name + " " + students.get(name));
//    }

}
