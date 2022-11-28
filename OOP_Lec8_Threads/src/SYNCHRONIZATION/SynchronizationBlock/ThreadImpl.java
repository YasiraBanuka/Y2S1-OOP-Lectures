package SYNCHRONIZATION.SynchronizationBlock;

public class ThreadImpl extends Thread{

    Sample sample;
    String name;
    public static final String THREAD0 = "Thread 0";
    public static final String THREAD1 = "Thread 1";

    public ThreadImpl(Sample sample, String name) {
        this.sample = sample;
        this.name = name;
    }

    // thread execution scenario implementation
    public static void main(String[] args) {
        Sample sample = new Sample();
        ThreadImpl t1 = new ThreadImpl(sample, THREAD0);
        ThreadImpl t2 = new ThreadImpl(sample, THREAD1);
        t1.start();
        t2.start();
    }

    // new thread implementation
    public void run() {
        sample.displayOutput(sample);
    }
}
