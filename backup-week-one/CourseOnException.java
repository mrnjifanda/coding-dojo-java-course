import java.util.ArrayList;

public class CourseOnException {

    public static void main(String[] args) {

        try {

            ArrayList<String> cars = new ArrayList<String>();

            cars.add("Toyota");
            cars.add("Carina 2");

            System.out.println(cars.get(0));

            System.out.println(cars.get(15));
        } catch (Exception e) {

            System.out.println("Program have error");
        }

        System.out.println("Hello");
    }

    public String myMethod () throws Exception {


        int age = 10;
        
        throw new Exception();
    }
}
