public class Main {

    public static void main (String[] args) {

        // age == 5 => Sil
        // age == 7 => CP
        // age == 11 => 6eme

        int age = 10;
        String showMessage =
            age == 5 ? "SIL" :
            age == 7 ? "CP" :
            age == 11 ? "6eme" :
            "Not class";
        System.out.println(showMessage);














        String message;
        boolean booleanMessage = false;

        if (age >= 18) {

            message = "Okay";
        } else {

            message = "Not Okay";
        }

        switch (message) {
            case "value":
                
                break;
        
            default:
                break;
        }

        System.out.println(message);

        String ternaryMessage = (age >= 18) ? "Okay" : "Not Okay";

        System.out.println(ternaryMessage);
    }
}