import java.util.ArrayList;

public class Loops {
    public static void main(String[] args) {
    
        firtsMethod();
        // secondMethod();
    }

    public static void firtsMethod() {
    
        ArrayList<String> snacks = new ArrayList<String> ();
        snacks.add("Apples");
        snacks.add("Almonds");
        snacks.add("Pretzels");
        snacks.add("Yogurt");

        System.out.println(snacks);

        for(int i=0; i < snacks.size(); i++) {

            if(snacks.get(i).charAt(0) == 'A') {

                snacks.remove(i);
                i--;
            }
        }

        System.out.println(snacks);
    }

    public static void secondMethod() {
    
        ArrayList<String> snacks = new ArrayList<String> ();
        snacks.add("Apples");
        snacks.add("Almonds");
        snacks.add("Pretzels");
        snacks.add("Yogurt");

        System.out.println(snacks);
        ArrayList<String> newSnacks = new ArrayList<String> ();
        for(int i=0; i < snacks.size(); i++) {

            if(snacks.get(i).charAt(0) != 'A') {

                newSnacks.add(snacks.get(i));
            }
        }

        System.out.println(newSnacks);
    }
}
