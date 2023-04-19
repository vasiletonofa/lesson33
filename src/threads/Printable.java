package threads;

public class Printable implements Runnable {

    static int counter = 0;// thread1, thread2, thread3, thread4, thread5


    @Override
    public void run() {
        // doar un thread poate modifica in acelasi timp

        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        counter = counter + 1;
        System.out.println("Executing in new Thread  1  ... counter: " + counter);
    }
}
