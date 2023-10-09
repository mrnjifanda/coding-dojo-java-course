import java.util.ArrayList;

public class Loops {

    public static void main(String[] args) {
        fruits();
    }

    public static  void fruits() {

        ArrayList<String> fruits= new ArrayList<String>();
        fruits.add("Peach");
        fruits.add("Orange");
        fruits.add("Pineapple");
        fruits.add("Banana");

        fruits.get(3);
  
        for (int i = 0; i < fruits.size(); i++) {

            String fruit = fruits.get(i);
            System.out.println(i + ". " + fruit);
        }

        //  Another systaxe
        for (String fruit : fruits) {

            System.out.println(fruit);
        }
    }

    public static void loopsExample() {

        ArrayList<Integer> myArray = new ArrayList<Integer>();
        // myArray.add(1);
        // myArray.add(2);
        // myArray.add(3);
        // myArray.add(4);
        // myArray.add(5);
        // myArray.add(6);
        // myArray.add(7);

        int i = 1;
        while (i <= 100) {
            myArray.add(i);
            i++;
        }

        System.out.println(myArray);

        int whileIndex = 0;
        while (whileIndex < 100) {
            whileIndex++;
        }

        for (int index = 0; index < myArray.size(); index++) {}

        for (int iArray : myArray) {}

        //  { Mange, Prune }
                // 1. Mange
                // 2. Prune

    }
}