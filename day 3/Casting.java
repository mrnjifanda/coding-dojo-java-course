public class Casting {

    public static void main (String[] args) {

        // double d = 35.25;

        // int i = (int) d;

        // System.out.println(i);
        // System.out.println(d);

        primiteVsObject();
    }

    public static void notTakeNull () {

        Integer isNull = null;
        // int notNull = null;
    }

    public static void primiteVsObject () {

        // int MAX_VALUE = 2147483647;
        long start = System.currentTimeMillis();
        Integer sum = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {

            sum += i;
        }

        System.out.println("Sum: " + sum);
        long end = System.currentTimeMillis();
        double total = (double) (end - start) / 1000;

        System.out.println((Integer.MAX_VALUE - sum));
        System.out.println("Time of execution: " + total + " secondes");
    }
}
