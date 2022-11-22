package GenericClass;

public class MyGen<T> {

    T obj;

    void add(T val) {
        this.obj = val;
    }

    T get() {
        return obj;
    }

}
