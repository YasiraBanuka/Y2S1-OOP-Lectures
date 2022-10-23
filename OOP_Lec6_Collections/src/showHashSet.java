import java.util.HashSet;
import java.util.Set;

public class showHashSet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(); // 'Set' is same as 'HashSet'
        set.add(10);
        set.add(20);
        set.add(50);
        set.add(50);
        set.add(20);
        set.add(10);

        for (Integer value : set) {
            System.out.println(value);
        }

    }
}
