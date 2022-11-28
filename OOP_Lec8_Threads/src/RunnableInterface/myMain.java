package RunnableInterface;

public class myMain {
    public static void main(String[] args) {
        ChildThread ob = new ChildThread();
//        ob.start(); // not work
        Thread ob2 = new Thread(ob);
        ob2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world in main thread " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Exception occurred");
            }
        }
    }
}
