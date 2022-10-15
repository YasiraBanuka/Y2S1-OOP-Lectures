package Ex2;

public class MyMain {

    public static void main(String[] args) {

        Printable printable = new Employee(124, "Kamal", "Malabe");
        printable.print();

        printable = new Book(2048, "Harry Potter", "J.K.Rowling");
        printable.print();

    }
}
