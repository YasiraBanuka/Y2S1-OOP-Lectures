public class main_MathOp {
    public static void main(String[] args) {
        MathOp math = new MathOp();
        math.add(2, 0);
        try {
            math.divide(2, 0);
        } catch (ArithmeticException ex) {
            System.out.println("Error : " + ex);
        }
    }
}
