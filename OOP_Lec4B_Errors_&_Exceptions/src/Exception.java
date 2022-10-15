public class Exception {
    public static void main(String[] args) {

        int d, a;

        try {
            a = 0;
            d =42 / a;
            System.out.println("this will not be printed");
        } catch(ArithmeticException e) {
            System.out.println("Exception : " + e);
            System.out.println("division by zero");
        }
    }
}
