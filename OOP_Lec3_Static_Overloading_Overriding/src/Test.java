public class Test {

    public static void main(String[] args) {

        ExStudent.batchId = "IT"; //directly accessing using class name --- recommended
        System.out.println(ExStudent.batchId);

        ExStudent obj = new ExStudent();
        obj.name = "Yasira";
        obj.batchId = "DS"; //accessing static variable through object -- not recommended

        ExStudent obj2 = new ExStudent();
        System.out.println(obj2.name);
        System.out.println(obj2.batchId); //prints "DS"

        obj2.batchId = "SE"; //accessing static variable through object -- not recommended
        System.out.println(obj.batchId);

    }

}
