package SYNCHRONIZATION.SynchronizedMethod;

// sample implementation using threads

public class Sample {
    public synchronized void displayOutput(Sample sample) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
