package SYNCHRONIZATION.SynchronizationBlock;

// Sample implements using Threads
public class Sample {
    public void displayOutput(Sample sample) {
        synchronized (sample) {
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
