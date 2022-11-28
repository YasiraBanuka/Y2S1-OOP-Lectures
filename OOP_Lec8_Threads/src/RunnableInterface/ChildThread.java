package RunnableInterface;

public class ChildThread implements Runnable{
    public void run() {
        for (int x = 0; x < 5; x++) {
            System.out.println("Hello world in child thread " + x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception occurred");
            }
        }
    }
}
