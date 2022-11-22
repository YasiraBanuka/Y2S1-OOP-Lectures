package Generics;

import java.util.ArrayList;
import java.util.Collection;

public class GenericsDemo {
    public static void main(String[] args) {

        Collection value = new ArrayList();
         value.add(10);
         value.add(20);
         value.add(30);
         value.add(40);
         value.add(50);

        System.out.println(value);

        //As it is not specified, we can use data type
        Collection value2 = new ArrayList();
        value2.add("SLIIT");
        value2.add(145);
        value2.add(23.457);
        value2.add(1.54f);
        value2.add('y');

        System.out.println(value2);

        //if we want to add only integers, we can use Generics to specifically mention accept only Integers.

//        Collection<Integer> val = new ArrayList<>();
//        val.add("SLIIT");
//        val.add(145);
//        val.add(23.654);
//        val.add(1.43f);
//        val.add('y');
//
//        System.out.println(val);

    }
}
