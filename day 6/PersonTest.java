public class PersonTest {
    public static void main(String[] args) {

        Person person1 = new Person(10, "Academy");

        Person person2 = new Person(14, "Seven");

        person1.numberOfpeople = 10; // Error


        Person person3 = new Person(14, "Seven");


        System.out.println("Person1: " + person1.numberOfpeople); // Error
        System.out.println("Person2: " + person2.numberOfpeople); // Error
        System.out.println("Person3: " + person3.numberOfpeople); // Error
        System.out.println("Global: " + Person.numberOfpeople);
    }
}