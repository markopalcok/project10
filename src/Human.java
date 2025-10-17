class Human {

    private final int age;

    Human(final int age) {
        this.age = age;
    }

    void checkAge() throws InvalidAgeException {
        if (this.age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");
        } else {
            System.out.println("You are 18 or older - you can enter. ");
        }
    }

}
