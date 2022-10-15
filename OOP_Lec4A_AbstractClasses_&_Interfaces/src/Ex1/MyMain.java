package Ex1;

public class MyMain {

    public static void main(String[] args) {

        //Animal class is used to show that even abstract classes can use for referencing -- can use 'Dog dog = new Dog();'
        Animal dog = new Dog();
        dog.eat();
        dog.makeSound();

        Animal cat = new Cat();
        cat.eat();
        cat.makeSound();

    }

}
