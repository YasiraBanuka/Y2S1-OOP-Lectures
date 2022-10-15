public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java StringBuffer Example");
        System.out.println("Original StringBuffer content : " + sb);

        sb.reverse();
        System.out.println("Reversed StringBuffer content : " + sb);
    }
}
