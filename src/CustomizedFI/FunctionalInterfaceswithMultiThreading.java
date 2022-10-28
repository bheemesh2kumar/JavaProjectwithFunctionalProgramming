package CustomizedFI;

public class FunctionalInterfaceswithMultiThreading {


    public static void main(String[] args) {

        Runnable runnable
                = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("i am in runnable  job");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("i am in main  job");
        }


    }


}
