package ThreadSynchornization;

class Display {
    synchronized void print() { // use synchronized keyword before the method name
        Thread t = Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            System.out.println(t.getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class T extends Thread {
    Display dis;

    public T(Display c) {
        this.dis = c;
    }

    public void run() {
        dis.print();
    }
}

public class Test {
    public static void main(String[] args) {
        Display obj = new Display();

        T t1 = new T(obj);
        t1.start();

        T t2 = new T(obj);
        t2.start();

//        System.out.println(t1.getName());
    }
}
