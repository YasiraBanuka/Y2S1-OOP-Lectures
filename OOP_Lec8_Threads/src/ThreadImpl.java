public class ThreadImpl extends Thread{

    // thread execution scenario implementation
    public static void main(String[] args) {
        ThreadImpl obj = new ThreadImpl();
        obj.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception occurred");
            }
        }
    }

    // new thread implementation
    public void run() {
        for (int x = 0; x < 10; x++) {
            System.out.println("New Thread " + x);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Exception occurred");
            }
        }
    }
}
