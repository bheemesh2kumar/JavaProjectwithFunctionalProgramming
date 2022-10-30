package predefinedFI;

public class LamdawithMultiThreadingTestingMain {

    public static void main(String[] args) {

      /*  LamdawithMultiThreading lamdawithMultiThreading = new LamdawithMultiThreading();
        Thread thread = new Thread(lamdawithMultiThreading);
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("i am normal method");

        }*/


        System.out.println("implementing with new lamda expressions");

        Runnable runnable1 = () ->
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("this is meulti method using lamda expressions");

            }
        };

        Thread thread1 = new Thread(runnable1);
        thread1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("i am normal method");

        }


    }
}
