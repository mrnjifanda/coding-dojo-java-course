public class StringCourse {

    public static void main(String[] args) {

        /*
         * length() and concat() Method
         */
        String message = "Hello";
        System.out.println(message + " have: " + message.length() + " characters");

        // System.out.println(String.format("%s have: $% characters", message, message.length()));

        String newMessage = message.concat(" Java students");
        System.out.println(newMessage);

        /*
         * indexOf()
         */
        String testIndexOf = "Welcome to Coding Dojo!";
        System.out.println(testIndexOf.indexOf("to"));

        /*
         * How to compare string in java
         */
        String hello = "My message";
        String secondHello = "My message";

        String newHello = new String("My message");
        String newSecondHello = new String("My message");


        if (newHello.equals(newSecondHello)) {
            System.out.println("Is same");
        } else {
            System.out.println("Not same");
        } 
    }
}
