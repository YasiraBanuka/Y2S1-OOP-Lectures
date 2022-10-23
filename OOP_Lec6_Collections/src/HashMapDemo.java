import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        // create a hash map
        HashMap<String, Double> hm = new HashMap<String, Double>();

        // put elements to the map
        hm.put("John Doe", 3434.34);
        hm.put("Tom Smith", 123.22);
        hm.put("Jane Baker", 1378.00);
        hm.put("Tod Hall", 99.22);
        hm.put("Ralph Smith", -19.08);

        // get a set of entries
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        // display the set
        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + " : ");
            System.out.println(me.getValue());
        }

        // deposit 1000 into John Doe's account
        double balance = hm.get("John Doe");
        hm.put("John Doe", (balance + 1000));

        System.out.println("John Doe's new balance : " + hm.get("John Doe"));

    }
}
