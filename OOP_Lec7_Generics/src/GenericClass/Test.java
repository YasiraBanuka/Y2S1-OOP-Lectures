package GenericClass;

public class Test {
    public static void main(String[] args) {

        MyGen<Integer> m = new MyGen<>();
        m.add(12);

        System.out.println("m = " + m.get());
    }
}
