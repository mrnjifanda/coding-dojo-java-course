public class Person {

    private int age; // Attribut de object
    private String name; // Attribut de object
    public static int numberOfpeople; // Attribut de classe

    public Person() {
        this(10, "Seven");
    }

    public Person(int age, String name) {

        this.age = age;
        this.name = name;
        numberOfpeople++;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static int getNumberOfpeople() {

        return numberOfpeople;
    }
}