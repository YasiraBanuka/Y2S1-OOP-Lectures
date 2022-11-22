package MultipleParameters;

public class Main {
    public static void main(String[] args) {

        TwoGen<Integer, String> tg = new TwoGen<>(123, "Anne");
        tg.showType(); //get the value

        int v = tg.getOb1();
        System.out.println("Value of V : " + v);

        String t = tg.getOb2();
        System.out.println("Value of T : " + t);

    }
}
