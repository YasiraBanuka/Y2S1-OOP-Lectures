public class Student {
    private int id;
    private String name;
    private double mark;

    //default constructor
    public Student() {
        id = 0;
        name = null;
        mark = 0.0;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public double getMark() {
        return mark;
    }

    //parameterized constructor - with all 3 values as parameters
    public Student(int sId, String pname, double pmark) {
        id = sId;
        name = pname;
        mark = pmark;
    }

    //parameterized constructor - with 2 valued passing as parameters
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.println("Your ID is : " + this.id); // can also use with "this" keyword
        System.out.println("Your name is : " + name);
        System.out.println("Your mark is : " + mark);
    }
}
