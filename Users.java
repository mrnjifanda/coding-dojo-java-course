import java.util.ArrayList;

public class Users {
    
    public static void main(String[] args) {

        SayHello(5);

    }

    public static void SayHello(int userIndex) {

        // try {

            ArrayList<String> users = AllUsers.getListUsers();
            System.out.println("Hello Mr " + users.get(userIndex));
        // } catch (Exception e) {

        //     System.out.println("User with index: " + userIndex + " not found");
        // }
    }
}
