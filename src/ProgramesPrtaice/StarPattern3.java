package ProgramesPrtaice;

public class StarPattern3 {


    public static void printnumberPattern(int rownum) {

        for (int i = 0; i < rownum; i++) {

            int val = 5;

            for (int j = rownum; j > i; j--) {

                System.out.print(val + " ");
                val--;

            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        printnumberPattern(5);
    }
}
