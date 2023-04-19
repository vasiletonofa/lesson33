import threads.Drawable;
import threads.Printable;

public class Main {
    public static void main(String[] args) {  // thread1 =  new Thread();


          System.out.println("Before...");


          Thread thread =  new Thread(new Printable()); // thread2

          thread.start();

//
//          Thread thread4 =  new Thread(new Printable()); // thread2
//          thread4.start();
//
//        Thread thread5 =  new Thread(new Printable()); // thread2
//        thread5.start();
//
//        Thread thread6 =  new Thread(new Printable()); // thread2
//        thread6.start();
//
//        Thread thread7 =  new Thread(new Printable()); // thread2
//        thread7.start();


//        thread.start();
//
//
          Thread thread1 = new Thread(() -> System.out.println("Running in new thread 2 ..."));
          thread1.start();
//
//          Thread thread2 = new Drawable();
//          thread2.start();

         System.out.println("After...");



         // FE    ->    BE (Tomcat ) - 100 task -> JVM 100000

        // Vasile ->  balanca contului ->  BE -> JVM start Thread 1
        // Vlad ->  balanca contului ->  BE
        // Andrei ->  balanca contului ->  BE
        // Gheorghe ->  balanca contului ->  BE

        // 101 -> cere balanta contului -> BE

        // Vasile -> staff 1 -> comanda
        // Andrei -> staff 1 -> comanda
        // Vlad -> staff 1 -> comanda


    }
}