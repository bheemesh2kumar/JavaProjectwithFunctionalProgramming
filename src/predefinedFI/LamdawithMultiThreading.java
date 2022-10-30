package predefinedFI;

public class LamdawithMultiThreading implements Runnable {


    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {

            System.out.println(" this is multi thread method");

        }

    }
}
