package ExtendThreadClass;

public class myThread {
    public static void main(String[] args) {

//        System.out.println("Hello world");

        ChildThread1 ob = new ChildThread1();
//        ob.run(); // this will not work, instead use .start() method
        ob.start();

        for (int x = 0; x < 10 ;x++) {
            System.out.println("Hello world in Main Thread " + x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception occurred");
            }
        }

    }
}
