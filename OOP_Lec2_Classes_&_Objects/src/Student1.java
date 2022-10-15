public class Student1 {
    protected String name;
    protected int age;
    protected double mark;

    public Student1() {
        this.name = null;
        this.age = 0;
        this.mark = 0.0;
    }

    public Student1(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void show() {
        System.out.println("Your name is : " + this.name);
        System.out.println("Your age is : " + this.age);
        System.out.println("Your mark is : " + this.mark);
    }

}
