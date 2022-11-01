package ProgramesPrtaice;

public class StarPattern2 {


    public static void printnumberPattern(int rownum) {

        for (int i = 1; i <= rownum; i++) {

            int val = i;

            for (int j = 1; j <= i; j++) {

                System.out.print(val + " ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        printnumberPattern(5);
        for (int i = 0; i < 5; i++) {
            System.out.println("this loop of " + i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("this loop of " + i);
        }
    }
}
