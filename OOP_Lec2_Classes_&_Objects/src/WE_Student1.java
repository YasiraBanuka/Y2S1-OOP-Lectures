public class WE_Student1 extends Student2 {
    private String job;

    public WE_Student1() {
        System.out.println("WE_Student1 default constructor");
    }

    public WE_Student1(String name, int age) {
        System.out.println("WE_Student1 2 constructor");
    }

    public WE_Student1(String name, int age, double mark) {
        //super(name, age);                                       //calling parent 2 constructor
        System.out.println("WE_Student1 3 constructor");
    }

    public WE_Student1(String name, int age, double mark, String job) {
        this();                                                   ///goes to same class default constructor
        System.out.println("WE_Student1 4 constructor");
    }
}
