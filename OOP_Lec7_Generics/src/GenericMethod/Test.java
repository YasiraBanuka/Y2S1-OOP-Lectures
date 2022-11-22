package GenericMethod;

public class Test {

    public static<E> void printArray(E[] elements) {

        for(E elem : elements) {
            System.out.print(elem + "\t");
        }

        System.out.println();

    }

    public static void main(String[] args) {

        Integer[] intArray = {12, 15, 45, 78, 92, 56, 78};
        Character[] charArray = {'S', 'L', 'I', 'I', 'T'};

        printArray(intArray);
        printArray(charArray);

    }
}
