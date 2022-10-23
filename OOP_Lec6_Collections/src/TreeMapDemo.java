import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(100, "Ajith");
        map.put(101, "Kamal");
        map.put(102, "Sunil");
        map.put(103, "Nimal");

        Set<Map.Entry<Integer, String>> set = map.entrySet();

//        for (Map.Entry m = map.entrySet()) {
//            System.out.println(m.getKey() + " " + m.getValue());
//        }

        for (Map.Entry<Integer, String> tm : set) {
            System.out.println(tm.getKey() + " " + tm.getValue());
        }

        map.remove(102);

        System.out.println("--After modification--");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
