import java.util.HashMap;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {

        HashMap<String, String> myHash = new HashMap<String, String>();

        myHash.put("seven@gmail.com", "Seven Academy");
        myHash.put("nninja@codingdojo.com", "Nancy Ninja");
        myHash.put("ssamurai@codingdojo.com", "Sam Samurai");

        myHash.get("seven@gmail.com"); // => Seven Academy


        Set<String> keys = myHash.keySet();
        for (String key : keys) {

            System.out.println("------------------");
            System.out.println(key);
            System.out.println(myHash.get(key));
        }
    }
}
