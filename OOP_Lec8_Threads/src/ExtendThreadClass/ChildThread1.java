package ExtendThreadClass;

public class ChildThread1 extends Thread {

    public void run() {
        for (int x = 0; x < 10; x++) {
            System.out.println("Hello World in child thread " + x);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Exception occurred");
            }
        }
    }

}
