class Person {
    private String name;
    private int age;

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
        if(age >= 0)
            this.age = age;
        else
            System.out.println("Age should be greater than 0");
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Yasira");
        p.setAge(4);

        System.out.println("Name : " + p.getName());
        System.out.println("Age : " + p.getAge());
    }
}
