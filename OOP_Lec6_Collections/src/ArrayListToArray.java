import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();

        // add elements to the array list
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Contents of al : " + al);

        // get the array
        Integer ia[] = new Integer[al.size()];
        ia = al.toArray(ia);

        // display array elemnts
        for(int i = 0; i < ia.length; i++) {
            System.out.println("Element " + (i+1) + " : " + ia[i]);
        }

        // sum of the array
        int sum = 0;

        for(int i = 0; i < ia.length; i++)
            sum += ia[i];

        System.out.println("Sum is : " + sum);

    }
}
