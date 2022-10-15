public class Student2 {
    String name;
    int age;
    double mark;

    public Student2() {
        System.out.println("parent default constructor");
    }

    public Student2(String name, int age) {
        System.out.println("parent 2 constructor");
    }

    public Student2(String name, int age, double mark) {
        System.out.println("parent 3 constructor");
    }
}
