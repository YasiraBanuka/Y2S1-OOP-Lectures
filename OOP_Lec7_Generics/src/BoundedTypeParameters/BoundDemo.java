package BoundedTypeParameters;

public class BoundDemo {
    public static void main(String[] args) {

        Integer inums[] = {1, 2, 3, 4, 5};
        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};

        Stats<Integer> ob1 = new Stats<>(inums);
        Stats<Double> ob2 = new Stats<>(dnums);
//      Stats<String> ob3 = new Stats<String>(inums); //gives an error -- because String is not a subclass of Number

        double i = ob1.average();
        System.out.println("Average of Integer Array : " + i);

        double d = ob2.average();
        System.out.println("Average of Double Array : " + d);

    }
}
