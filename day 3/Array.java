import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        arrayList();
    }

    public static void arrayFixed() {

        int[] myArray;
        myArray = new int[5];
        myArray[0] = 4;
        myArray[1] = 8;
        myArray[2] = 8;
        myArray[3] = 5;
        myArray[4] = 9;

        System.out.println(myArray);
        int[] myNewArray = {4, 8, 8, 5, 9};
    }

    public static void arrayList() {
        
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(10); // { 10 }
        myArray.add(12); // { 10, 12 }
        System.out.println(myArray);

        myArray.get(0); // 10
        myArray.get(1); // 12

        myArray.set(0, 13);
        myArray.get(0); // 13

        myArray.contains(5);
        // myArray.clear();
        myArray.isEmpty();

        System.out.println(myArray);
    }
}

// MonNom
