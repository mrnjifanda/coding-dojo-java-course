public class App {

    public static void main(String[] args) {



        String ninja = "Coding Dojo is Awesome!";
        int length = ninja.length();

        String reslutOfConcat = ninja.concat(" Very good"); // Coding Dojo is Awesome! Very good

        String newResultOfConcat = ninja + " Very good";

        // %s => If you want to add string
        // $% => If you want to add number

        String string = String.format("Hello %s !!!", "Seven"); // Hello Seven !!!
        String string1 = String.format("Hello %s !!! My name is %s", "Seven", "Coding"); // Hello Seven !!! My name is Coding

        System.out.println( "String Length is : " + length );














        boolean isRaining = false;
        if (isRaining) {

            System.out.println("Bring an umbrella.");
        } else {

        }

        int level = 3;

        if (level == 1) {
            
        } else if (level == 2) {

        } else if (level == 3) {

        } else {

        }

        switch (level) {
            case 1:
                
                break;
            case 2:

                break;
            case 3:

                break;
        
            default:
                break;
        }
    }   
 
    public String myMethod() {

      // type |    name      | value
        double currencyRate = 655.40;
        float floatCurrent = (float) currencyRate;


        return "Hello";
    }
    // Variable name: snacke_case (_) or camelCase (capital Letter)
    // Method name: camelCase
    // Class name: PascalCase
    // Constante name: screaming snake case => NUMBER_OF_USERS
}
