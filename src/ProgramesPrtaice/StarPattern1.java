package ProgramesPrtaice;

public class StarPattern1 {


    public static void printnumberPattern(int rownum) {

        for (int i = 0; i < rownum; i++) {

            int val = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        printnumberPattern(5);
    }
}
