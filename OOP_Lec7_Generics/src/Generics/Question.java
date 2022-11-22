package Generics;

import java.util.ArrayList;
import java.util.Collection;

public class Question {
    public static void main(String[] args) {
        Collection<String> ob = new ArrayList<>();
            ob.add("Kamal");
            ob.add("Amal");
            ob.add("Nimal");

        System.out.println(ob);
    }
}
