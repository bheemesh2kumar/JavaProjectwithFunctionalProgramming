package LamdaWithClasses;

public class AnnonimousInnerClass {


    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                for (int i = 10; i > 5; i--) {

                    System.out.println("i am annonimous innter class");

                }

            }
        };


        Thread thread = new Thread(runnable);
        thread.start();

        for (int i = 10; i > 5; i--) {

            System.out.println("i am main class");

        }


    }


}
