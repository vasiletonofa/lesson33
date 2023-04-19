package threads;

public class Drawable extends Thread {

    @Override
    public void run() {
        System.out.println("Drawing Circle in new Thread 3 ...");
    }
}
