public class MethodCourse {
    public static void main(String[] args) {

        new MethodCourse().calcul(2, 4);
    }

    public int calcul (int number1, int numberSecond) {

        int result = number1 * numberSecond;
        return result;
    }

    public void getResult () {

        int result = calcul(1, 10);
        System.out.println(result);
    }
}
