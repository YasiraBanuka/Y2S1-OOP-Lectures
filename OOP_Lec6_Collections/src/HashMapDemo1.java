import java.util.*;

public class HashMapDemo1 {
    public static void main(String[] args) {

        HashMap<String, Integer> hmap = new HashMap<>();
        hmap.put("Amal", 75);
        hmap.put("Kamal", 80);
        hmap.put("Nimal", 55);

        Set<Map.Entry<String, Integer>> myset = hmap.entrySet();

        for(Map.Entry<String, Integer> val : myset) {
            System.out.println("Key : " + val.getKey() + "\t\tValue : " + val.getValue());
        }

        Integer result = hmap.get("Kamal");
        result = result + 10;
        hmap.put("Kamal", result);

        hmap.put("Amal", 1000);

        System.out.println("<---After modifications--->");
        for (Map.Entry<String, Integer> val : myset) {
            System.out.println("Key : " + val.getKey() + "\t\tValue : " + val.getValue());
        }

    }
}
