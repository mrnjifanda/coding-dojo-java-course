public class Level {
    
    public static void main(String[] args) {

        Student studentTwo = new Student();
        Student studentOne = new Student("Academy", 13, 15, 11);

        studentTwo.getMoyene(studentOne);


        studentOne.equals(studentTwo);
        // System.out.println("studentOne: " + studentTwo.getMoyene());
    }
}
