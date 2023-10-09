
public class MyNewClass {

    public static int age = 10;
    public static void main(String[] args) {

        extracted();
        extractedTwo();
    }

    private static void extracted() {


        for (int i = 0; i < 2000; i++) {
            System.out.println("Age + index: " + (MyNewClass.age + i));
            System.out.println("Age + index: " + (MyNewClass.age + i));
            System.out.println("Age + index: " + (MyNewClass.age + i));
            System.out.println("Age + index: " + (MyNewClass.age + i));
        }
    }
    protected static void extractedTwo () {

        int age = 10;
        for (int i = 0; i < 2000; i++) {
            System.out.println("Age + index: " + (age + i));
            System.out.println("Age + index: " + (age + i));
            System.out.println("Age + index: " + (age + i));
            System.out.println("Age + index: " + (age + i));
        }
    }
}
