import java.util.*;

public class showTreeSet {
    public static void main(String[] args) {

        SortedSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(50);
        set.add(50);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(40);
        set.add(60);
        set.add(10);

        for (Integer value : set) {
            System.out.println(value);
        }

    }
}
