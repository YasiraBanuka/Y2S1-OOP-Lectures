public class StringBuilderDemo0 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < 5; i++) {
            builder.append("abc  ");
        }
        System.out.println(builder);
    }
}
