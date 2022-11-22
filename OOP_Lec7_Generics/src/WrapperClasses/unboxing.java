package WrapperClasses;

public class unboxing {

    public static void main(String[] args) {

        //converting Integer to int

        Integer a = new Integer(5); //boxing
        int i = a.intValue(); //converting Integer
        int j = a; //autoboxing

        System.out.println("a = " + a);
        System.out.println("i = " + i);
        System.out.println("j = " + j);

    }
}
