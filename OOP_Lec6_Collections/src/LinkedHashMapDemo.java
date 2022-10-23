import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
        hm.put(100, "Amal");
        hm.put(101, "Nimal");
        hm.put(102, "Kamal");

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }


        // fetching key
        System.out.println("Keys : " + hm.keySet());
        // fetching value
        System.out.println("Values : " + hm.values());
        // fetching key-value pair
        System.out.println("Key-Value pair : " + hm.entrySet());

    }
}
