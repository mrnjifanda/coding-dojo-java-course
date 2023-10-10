import java.util.HashMap;
import java.util.Set;
// import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {

        // ArrayList<String> listOfCars = new ArrayList<String>();
        HashMap<String, String> listOfUsers = new HashMap<String, String>();

        listOfUsers.put("seven@academy.com", "Seven");
        listOfUsers.put("admin@academy.com", "Admin");
        listOfUsers.put("students@academy.com", "Students");
        String getName = listOfUsers.get("seven@academy.com"); // Seven
        System.out.println(getName);

        Set<String> mapKeys = listOfUsers.keySet();

        for (String key : mapKeys) {

            String name = listOfUsers.get(key);
            System.out.println(name);
        }

        // TreeMap<String, String> treeMap = new TreeMap<String, String>();
    }
}
