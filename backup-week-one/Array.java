import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {

        String[] myArray = new String[10];
                           // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9

        myArray[2] = "Hello";

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1); // Add element in array
        arrayList.get(0); // Get element in array with id
        arrayList.remove(1); // Delete one element in array with index
        arrayList.clear(); // Delete all element in array
        arrayList.size(); // Get the size of array
        arrayList.isEmpty(); // Retourne true or false is array is empty or not
        arrayList.set(0, 9); // Change content with specific index in array

        arrayList.get(3);

        // Get informations (Name) of user with email.
    }
}
