public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("abc");
        builder.insert(2, "xyz");
        System.out.println(builder);
    }
}
