import java.util.Date;

public class Modularization {

    public static void main(String[] args) {

        Date myDate = new Date();

        MethodCourse methodCourse = new MethodCourse();

        int result = methodCourse.calcul(4, 5);

        System.out.println(myDate);
        System.out.println(result);
    }
}