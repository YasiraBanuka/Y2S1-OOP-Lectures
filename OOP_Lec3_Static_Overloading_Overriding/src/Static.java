public class Static {

    public static void main(String[] args) {

        Student s1 = new Student("1234", "Kamal");
        Student s2 = new Student("6789", "NImal");

        s1.setBatchId("Malabe Y1B2");

        System.out.println(s1.getBatchId() + " - " + s1.getDitno());
        System.out.println(s2.getBatchId() + " - " + s2.getDitno());

        Student.setBatchId2("Metro Y1B1");
        System.out.println(s1.getBatchId() + " - " + s1.getDitno());
    }
}
