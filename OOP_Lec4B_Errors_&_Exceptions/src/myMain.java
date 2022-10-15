public class myMain {
    public static void main(String[] args) {
        try {
            String num = "123a";
            int value = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            System.out.println("Exception : " + e);
            System.out.println("cannot convert to a integer/wrong number format");
        } finally {
            System.out.println("end of the operation");
        }
    }
}
