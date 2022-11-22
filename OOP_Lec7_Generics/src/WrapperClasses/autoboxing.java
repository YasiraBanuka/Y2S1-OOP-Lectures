package WrapperClasses;

public class autoboxing {
    public static void main(String[] args) {

        int a = 50;

        Integer i = Integer.valueOf(a); //converting int into Integer
        Integer j = a; //autoboxing

        System.out.println(a);
        System.out.println(i);
        System.out.println(j);

    }
}
