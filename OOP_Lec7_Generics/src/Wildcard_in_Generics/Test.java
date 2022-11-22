package Wildcard_in_Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {

    //creating a method that accepts only the child classes of Shape
    public static void drawShapes(List<? extends Shape> lists) {
        for (Shape s : lists)
            s.draw();
    }

    public static void main(String[] args) {

        List<Rectangle> list1 = new ArrayList<>();
        list1.add(new Rectangle());

        List<Circle> list2 =new ArrayList<>();
        list2.add(new Circle());
        list2.add(new Circle());

        drawShapes(list1);
        drawShapes(list2);

    }
}
